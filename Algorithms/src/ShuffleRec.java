public class ShuffleRec{
	public char X[], Y[], Z[];

public static void main(String args[]){
	try{
	String xString, yString, zString ="";
	/*if(args.length == 0){
		System.err.println(helpPrint());
	}*/
	xString = args[0];
	yString = args[1];
	zString = args[2];
	System.out.println(shuffRec(xString, yString, zString, 0, 0, 0));
}catch (Exception e){
	System.err.println(helpPrint());
}
}

private static boolean helpPrint() {
	System.out.println("Please enter Arguments X Y Z");
	return false;
}


//recursive method for shuffle
private static boolean shuffRec(
String xString, String yString, String zString, int pos1, int pos2, int pos3
		){

System.out.println(yString.substring(pos1) + "," + xString.substring(pos2) + "," +
				    zString.substring(pos3));
while(true){
boolean valid1 = false;
boolean valid2 = false;

	if(pos3 >= zString.length()){
		return true;
		}
	if(pos1 < xString.length()){
		valid1 = (zString.charAt(pos3) == xString.charAt(pos1));
	}
	if(pos2 < yString.length())
		valid2 = (zString.charAt(pos3) == yString.charAt(pos2));
	return (
			(valid1 && shuffRec (xString, yString, zString, pos1 +1, pos2, pos3+1)) ||
			(valid2 && shuffRec (xString, yString, zString, pos1, pos2+1, pos3+1))
			);
		

}

}
}