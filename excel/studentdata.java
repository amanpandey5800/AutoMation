package excel;

public class studentdata {
	 int sid;
	 static int maths;
	 static int phy;
	
	
	public studentdata(int sid,int phy,int maths) {
		this.sid=sid;
		this.maths=maths;
		this.phy=phy;
	}
	
	public int average() {
		return (phy+maths)/2;
	}
	

}
