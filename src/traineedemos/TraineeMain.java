package traineedemos;

import java.util.*;
import java.util.Set;

import java.util.Map;

public class TraineeMain {

	private Map<Integer, Trainee> map = new HashMap<>();

	Set<EceTrainee> ecetrainees = new HashSet<>();

	Set<CsTrainee> cstrainees = new HashSet<>();

	public static void main(String args[]) {
		TraineeMain trainee = new TraineeMain();

		trainee.run();

	}

	public void run() {
		map.put(1, (new EceTrainee(1, "sai", "multimeter")));
		map.put(2, (new CsTrainee(2, "teja", 5)));
		map.put(3, (new EceTrainee(3, "ashok", "voltmeter")));
		map.put(4, (new CsTrainee(4, "naveen", 6)));

		for (Trainee trainee : map.values()) {

			boolean isCs = trainee instanceof CsTrainee;
			if (isCs) {
				cstrainees.add((CsTrainee) trainee);

			} else {
				ecetrainees.add((EceTrainee) trainee);
			}

		}

		System.out.println("***DISPLAY ALL CS TRAINEES***");

		for (CsTrainee cset : cstrainees) {
			int id = cset.getId();
			int language = cset.getLanguage();
			String name = cset.getName();
			System.out.println("  name " + name + "  " + "lang" + language + "  " + "id" + id);

		}

		System.out.println("*****DISPLAY ALL ECE TRAINEES****");

		for (EceTrainee ecet : ecetrainees) {
			int id = ecet.getId();
			String device = ecet.getDevice();
			String name = ecet.getName();
			System.out.println("name" + name + " id" + id + "  " + "device" + device + "  ");

		}
	}

}