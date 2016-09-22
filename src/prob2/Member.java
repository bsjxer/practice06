package prob2;

public class Member {
	private String id;
	private String name;
	
	public Member( String nick, String name ){
		this.id = nick;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString(){
		return this.id + ":" + this.name;
	}
}
