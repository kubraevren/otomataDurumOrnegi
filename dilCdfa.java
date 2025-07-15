import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class dilCdfa {

	public static void main(String[] args) {
		System.out.println("Dil C: En az iki a ve iki b içerir.");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dizgeyi girin: ");
		String input = scanner.nextLine();

		Set<String> durumlar = new HashSet<>(Arrays.asList("q0", "q1", "q2", "q3", "q4", "q5", "q6"));
		Set<Character> alfabe = new HashSet<>(Arrays.asList('a', 'b'));
		Map<String, Map<Character, String>> gecisFonksiyonu = new HashMap<>();

		gecisFonksiyonu.put("q0", Map.of('a', "q1", 'b', "q2"));
		gecisFonksiyonu.put("q1", Map.of('a', "q4", 'b', "q3"));
		gecisFonksiyonu.put("q2", Map.of('a', "q3", 'b', "q5"));
		gecisFonksiyonu.put("q3", Map.of('a', "q4", 'b', "q5"));
		gecisFonksiyonu.put("q4", Map.of('a', "q4", 'b', "q6"));
		gecisFonksiyonu.put("q5", Map.of('a', "q6", 'b', "q5"));
		gecisFonksiyonu.put("q6", Map.of('a', "q6", 'b', "q6"));

		String baslangic = "q0";
		Set<String> kabulDurumu = new HashSet<>(Arrays.asList("q6"));
		for (char sembol : input.toCharArray()) {
			if (!alfabe.contains(sembol)) {
				System.out.println("Hatalı sembol: " + sembol + " alfabede bulunmamaktır: alfabe: " + alfabe);
				return;
			}
		}
		System.out.println();
		System.out.println("baslangic durumu : " + baslangic);
		System.out.println("kabul durumu : " + kabulDurumu);
		System.out.println("alfabe: " + alfabe);
		System.out.println("gecis fonksiyonu: " + gecisFonksiyonu);

		System.out.println();
		String mevcutDurum = baslangic;

		for (char sembol : input.toCharArray()) {
			if (gecisFonksiyonu.containsKey(mevcutDurum) && gecisFonksiyonu.get(mevcutDurum).containsKey(sembol)) {
				mevcutDurum = gecisFonksiyonu.get(mevcutDurum).get(sembol);
				System.out.println("\u001B[34m" + baslangic + "\u001B[0m ----> \u001B[31m" + sembol
						+ "\u001B[0m ----> \u001B[34m" + mevcutDurum + "\u001B[0m");
				baslangic = mevcutDurum;
			} else {
				System.out.println("Geçiş yapılamaz. Reddedildi.");
				return;
			}
		}

		if (kabulDurumu.contains(mevcutDurum)) {
			System.out.println("\u001B[32mDizge kabul edildi!\u001B[0m");
		} else {
			System.out.println("\u001B[31mDizge reddedildi!\u001B[0m");
			System.out.println("\u001B[31m" + kabulDurumu + " kabul durumuna ulaşmadı.\u001B[0m");
		}

	}
}