package day29;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

import com.opencsv.CSVReader;


public class StateCensusAnalyser {

	static String CVSfile = "src\\main\\resources\\CSVfile.csv";
	static int count = 0;
	public static void getDataFromCSVfile(String fileURl) {
		try {
			Reader r = new BufferedReader(new FileReader(fileURl));
			@SuppressWarnings("resource")
			CSVReader c = new CSVReader(r);
			String[] records;
			CSVStateCensus obj = new CSVStateCensus();
			while ((records = c.readNext()) != null) {
				count++;
				obj.setSno(Integer.parseInt(records[0]));
				obj.setName(records[1]);
				obj.setCode(records[2]);
				System.out.println(obj.toString());
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		getDataFromCSVfile(CVSfile);
	}

}
