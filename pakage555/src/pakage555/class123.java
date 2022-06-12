package pakage555;

public class class123 {
        public static void main(String[] args) {
		      String a= "Velocity";
			String b = "Velocity";
			
			
			String c = new String ("Velocity");
			String d = new String ("Velocity");
			
			System.out.println(a==b);
			System.out.println(c==d);
			System.out.println(a==d);
			System.out.println(a==c);
			System.out.println("--------xxx------");	
			b = "Demo";
			
			System.out.println(b);
		System.out.println(a);
		System.out.println(a==b);
		System.out.println("-------------xxx---");
		b = "Velocity";
		
		System.out.println(b);
		System.out.println(a);
		System.out.println(a==b);
		System.out.println("---------xxx-------");
		
	boolean	v= a.equals(b);
	boolean	y= a.equals(d);
	System.out.println(v);
	System.out.println(y);
	System.out.println("-------xxx---------");
	
	v = a.equals("Velocity");
	System.out.println(v);
	
	v = a.equalsIgnoreCase("velocity");
	System.out.println(v);
	System.out.println("----xxx--------");
	
	a = a.toUpperCase();
	System.out.println(a);

	a = a.toLowerCase();
	System.out.println(a);
	System.out.println("-------xox-----");
	
	int i = a.length();
	System.out.println(i);
	
char r = a.charAt(4);
System.out.println(r);
	        // or
//	System.out.println(a.charAt(4));
int g = a.indexOf('i');
System.out.println(g);

int j =a.lastIndexOf('i');
System.out.println(j); 
System.out.println("-------xox---------");

System.out.println(b.startsWith("Velo"));
System.out.println(a.endsWith("ity"));

System.out.println(b.substring(3));

//System.out.println(b.substring(10,17));

b = "   Velocity class batch 2021  ";
System.out.println(b);
System.out.println(b.trim()); //Remove first and last space
    //   String k = "Velocity class batch 2021";
    // System.out.println(k);
    // String [] x = k.split(" "); 
    //		 for (int y1 = 0; y1 < x.length;i++ )
    // {System.out.println(x[i]);
     //}
     System.out.println(b.replace('i', 'Z'));
   
    
      System.out.println(b.replace("ity", "ABC"));
      
      c = "Velocity";
      System.out.println(c);
 //  c = c.concat("Batch");
 //  System.out.println(c);
             //OR
      c = c+ "Batch2021";
      System.out.println(c);
      
        }}
