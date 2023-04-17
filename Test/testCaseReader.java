import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class testCaseReader {
    static List<String> readByProjectIDAutomationRequirements(int projetctID) throws IOException {
        List<String> list = new ArrayList<>();
        String count = ReadExcelExample.readExcelContent(projetctID, 2);
        String duration= ReadExcelExample.readExcelContent(projetctID, 3);
        String platformSupported= ReadExcelExample.readExcelContent(projetctID, 4);
        String cycles= ReadExcelExample.readExcelContent(projetctID, 5);
        list.add(count);
        list.add(duration);
        list.add(platformSupported);
        list.add(cycles);
        return list;
    }

    void readByProjectIDSetupEffort(int projetctID) throws IOException {
        String testDuration= ReadExcelExample.readExcelContent(projetctID, 6);
        String testa= ReadExcelExample.readExcelContent(projetctID, 7);

    }
}
