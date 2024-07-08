
public class Player {
	private int id;
	private String name;
	private int run;
	private String pt;
	private String mt;
	
	public Player(int id, String name, int run, String pt, String mt) {
		super();
		this.id = id;
		this.name = name;
		this.run = run;
		this.pt = pt;
		this.mt = mt;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	
	public String getpt() {
		return pt;
	}
	public void setpt(String p) {
		this.pt = p;
	}
	
	public String getmt() {
		return mt;
	}
	public void setmt(String m) {
		this.mt= m;
	}

}





