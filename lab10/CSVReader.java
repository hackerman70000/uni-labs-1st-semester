import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    private List<String[]> rows = new ArrayList<>();
    private String fileName;
    private String separator;

    public CSVReader(String fileName, String separator) {
        this.fileName = fileName;
        this.separator = separator;
    }

    public static void main(String[] args) throws InvalidColumnQuantityException, NoColumnNameException, NotACSVFileException {
        CSVReader csvReader = new CSVReader("oscar_age_male.csv", ",");
        System.out.println(csvReader.read());
        System.out.println(csvReader);
    }

    public List<String[]> read() throws NoColumnNameException, InvalidColumnQuantityException, NotACSVFileException {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 0;
            int expectedColumnCount = -1;
            while ((line = br.readLine()) != null) {
                lineNumber++;
                String[] cells = line.split(separator);
                if (lineNumber == 1) {

                    if (cells.length == 0 || cells[0].isEmpty())
                        throw new NoColumnNameException("No column names found in first line of file");
                    expectedColumnCount = cells.length;
                } else {

                    if (cells.length != expectedColumnCount) {
                        throw new InvalidColumnQuantityException("Line " + lineNumber + " has an invalid number of columns");}
                }
                rows.add(cells);
            }

            if (!fileName.endsWith(".csv")) {
                throw new NotACSVFileException("File is not a CSV file (incorrect file extension)");
            }

            return rows;
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return null;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        rows.forEach(row -> {
            sb.append(String.join(":", row));
            sb.append(System.lineSeparator());
        });
        return sb.toString();
    }
}