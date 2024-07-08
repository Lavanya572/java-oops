import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		//int num = Integer.parseInt(inp.nextLine());
		Player[] p = new Player[4];
		
		for(int i=0; i<p.length; i++) {
			int id = inp.nextInt();
			inp.nextLine();
			String name = inp.nextLine();
			int run = inp.nextInt();
			inp.nextLine();
			String pt = inp.nextLine();
			String mt = inp.nextLine();
			
			p[i] = new Player(id, name, run, pt, mt);
		}
		//inp.nextLine();
		String pt = inp.nextLine();
		String mt = inp.nextLine();
		int ans = findLow(p, pt);
		if(ans > 0) {
			System.out.println(ans);
		} else {
			System.out.println("No such Players");
		}
		
		Integer[] res = findMtype(p, mt);
		Arrays.sort(res, Collections.reverseOrder());
		if(res != null) {
			for(int id : res) {
				System.out.println(id);
			}
			
		} else {
			System.out.println("No such Players");
		}
		
		
		inp.close();

	}
	
	public static int findLow(Player[] p, String pt) {
		if(p.length == 0) return 0;
		
		Player min = p[0];
		for(Player c: p) {
			if(c.getRun() < min.getRun() && c.getpt().equalsIgnoreCase(pt)) {
				min = c;
			}
		}
		return min.getRun();
	}
	
	public static Integer[] findMtype(Player[] p, String mt) {
		
		int cnt = 0;
		for(Player c:p) {
			if(c.getmt().equalsIgnoreCase(mt)) {
				cnt++;
			}
		}
		Integer[] arrId = new Integer[cnt];
		int i = 0;
		for(Player c:p) {
			if(c.getmt().equalsIgnoreCase(mt)) {
				arrId[i] = c.getId();
				i++;
			}
		}
		return arrId;
	}

}
