/*
import java.util.Scanner;
import java.util.ArrayList;

class Kaiju {

    String name;
    String Category;
    int Height;
    int Weight;
    ArrayList<String> Power = new ArrayList<String>();
    String Description;

    Kaiju() {

    }

    Kaiju(String name) {
        this.name = name;
    }

    Kaiju(String name, String Category, int Height, int Weight, String[] Power, String Description) {
        this.name = name;
        this.Category = Category;
        this.Height = Height;
        this.Weight = Weight;
        for (int i = 0; i < Power.length; i++) {
            this.Power.add(Power[i]);
        }
        this.Description = Description;
    }

    void PrintDetail() {
        if (name == null) {
            System.out.println("Kaiju : Unknown");
        } else {
            System.out.println("Kaiju : " + name);
        }
        if (Category != null) {
            System.out.println("< Category: Category " + Category + " >");
            System.out.println("Height: " + Height + " feet (" + (Height / 3.2808) + " meters)");
            System.out.println("Weight: " + Weight + " tons");
            System.out.println("Power: [" + Power.size() + "] :");
            for (int i = 0; i < Power.size(); i++) {
                System.out.println(Power.get(i));
            }
            System.out.println("Description: " + Description);
        } else {
            System.out.println("< Category: Category Unknown >");
            System.out.println("Height: Unknown");
            System.out.println("Weight: Unknown");
            System.out.println("Power: Unknown");
            System.out.println("Description: Unknown");
        }
    }
}

class Jaeger {

    String name;
    String CoO;
    int mark;
    double h;
    ArrayList<String> strp = new ArrayList<String>();
    ArrayList<String> strw = new ArrayList<String>();

    Jaeger() {

    }

    Jaeger(String name) {
        this.name = name;
    }

    Jaeger(String name, String CoO, int mark, double h, String[] strp, String[] strw) {
        this.name = name;
        this.CoO = CoO;
        this.mark = mark;
        this.h = h;
        for (int i = 0; i < strp.length; i++) {
            this.strp.add(strp[i]);
        }
        for (int i = 0; i < strw.length; i++) {
            this.strw.add(strw[i]);
        }
    }

    void PrintDetail() {
        if (name == null) {
            System.out.println("Jaegers : Unknown");
        } else {
            System.out.println("Jaegers : " + name);
        }

        if (CoO == null) {
            System.out.println("< Country of Origin: Unknown >");
        } else {
            System.out.println("< Country of Origin: " + CoO + " >");
        }

        if (mark == 0) {
            System.out.println("< Mark: Unknown >");
        } else {
            System.out.println("< Mark: Mark-" + mark + " >");
        }

        if (h == 0) {
            System.out.println("Height: Unknown");
        } else {
            System.out.println("Height: " + h + " meters");
        }

        if (strp.size() == 0) {
            System.out.println("Pilots: Unknown");
        } else {
            System.out.println("Pilots: [" + strp.size() + "] :");
            for (int i = 0; i < strp.size(); i++) {
                System.out.println(strp.get(i));
            }
        }

        if (strw.size() == 0) {
            System.out.println("Weapons: Unknown");
        } else {
            System.out.println("Weapons: [" + strw.size() + "] :");
            for (int i = 0; i < strw.size(); i++) {
                System.out.println(strw.get(i));
            }
        }

    }
}

public class PacificRim {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Jaeger j = null;
        Kaiju k = null;
        int typeK = sc.nextInt();
        if (typeK == 0) {
            k = new Kaiju();
        } else if (typeK == 1) {
            String name = sc.next();
            k = new Kaiju(name);
        } else if (typeK == 2) {
            String name = sc.next();
            String Category = sc.next();
            int Height = sc.nextInt();
            int Weight = sc.nextInt();
            String strp = sc.nextLine();
            strp = sc.nextLine();
            String Power[] = strp.split(",");
            String Description = sc.nextLine();
            k = new Kaiju(name, Category, Height, Weight, Power, Description);
        }
        int typeJ = sc.nextInt();
        if (typeJ == 0) {
            j = new Jaeger();
        } else if (typeJ == 1) {
            String t = sc.nextLine();
            String name = sc.nextLine();
            j = new Jaeger(name);
        } else if (typeJ == 2) {
            String temp = sc.nextLine();
            String name = sc.nextLine();
            String CoO = sc.nextLine();
            int mark = sc.nextInt();
            double h = sc.nextDouble();
            temp = sc.nextLine();
            String str = sc.nextLine();
            String strp[] = str.split(",");
            String str2 = sc.nextLine();
            String strw[] = str2.split(",");
            j = new Jaeger(name, CoO, mark, h, strp, strw);
        }
        System.out.println("====================");
        j.PrintDetail();
        System.out.println("VS");
        k.PrintDetail();
        System.out.println("====================");
    }
}
*/
import java.util.Scanner;
import java.util.ArrayList;

class Kaiju {
	private String name;
	private String category;
	private int height;
	private int weight;
	private ArrayList<String> power = new ArrayList<String>();
	private String description;

	Kaiju() {

	}

	Kaiju(String name) {
		this.name = name;
	}

	Kaiju(String name, String category, int height, int weight, String[] power, String description) {
		this.name = name;
		this.category = category;
		this.height = height;
		this.weight = weight;

		for (int i = 0; i < power.length; i++) {
			this.power.add(power[i]);
		}

		this.description = description;
	}

	void PrintDetail() {
		if (name == null)
			System.out.println("Kaiju : Unknown");
		else
			System.out.println("Kaiju : " + name);

		if (category != null) {
			System.out.println("< Category: Category " + category + " >");
			System.out.println("Height: " + height + " feet (" + (height / 3.2808) + " meters)");
			System.out.println("Weight: " + weight + " tons");
			System.out.println("Power: [" + power.size() + "] :");
			for (int i = 0; i < power.size(); i++) {
				System.out.println(power.get(i));
			}
			System.out.println("Description: " + description);
		} else {
			System.out.println("< Category: Category Unknown >");
			System.out.println("Height: Unknown");
			System.out.println("Weight: Unknown");
			System.out.println("Power: Unknown");
			System.out.println("Description: Unknown");
		}
	}
}

class Jaeger {

	private String name;
	private String country;
	private int number;
	private double height;
	private ArrayList<String> pilots = new ArrayList<String>();
	private ArrayList<String> weapons = new ArrayList<String>();

	Jaeger() {

	}

	Jaeger(String name) {
		this.name = name;
	}

	Jaeger(String name, String country, int number, double height, String[] pilots, String[] weapons) {
		this.name = name;
		this.country = country;
		this.number = number;
		this.height = height;
		for (int i = 0; i < pilots.length; i++) {
			this.pilots.add(pilots[i]);
		}
		for (int i = 0; i < weapons.length; i++) {
			this.weapons.add(weapons[i]);
		}
	}

	void PrintDetail() {
		if (name == null)
			System.out.println("Jaegers : Unknown");
		else
			System.out.println("Jaegers : " + name);

		if (country == null)
			System.out.println("< Country of Origin: Unknown >");
		else
			System.out.println("< Country of Origin: " + country + " >");
		
		if(number == 0)
			System.out.println("< Mark: Unknown >");
		else
			System.out.println("< Mark: Mark-" + number + " >");
		
		if(height == 0)
			System.out.println("Height: Unknown");
		else
			System.out.println("Height: " + height + " meters");
		
		if(pilots.size() == 0)
			System.out.println("Pilots: Unknown");
		else {
			System.out.println("Pilots: [" + pilots.size() + "] :");
			for (int i = 0; i < pilots.size(); i++) {
				System.out.println(pilots.get(i));
			}
		}
		
		if(weapons.size() == 0)
			System.out.println("Weapons: Unknown");
		else {
			System.out.println("Weapons: [" + weapons.size() + "] :");
			for (int i = 0; i < weapons.size(); i++) {
				System.out.println(weapons.get(i));
			}
		}
			
	}
}

public class PacificRim {

	public static void main(String[] args) {
		// TODO code application logic here

		Scanner sc = new Scanner(System.in);
		Jaeger j = null;
		Kaiju k = null;

		int typeK = sc.nextInt();
		if (typeK == 0) {
			k = new Kaiju();
		} else if (typeK == 1) {
			String name = sc.next();
			k = new Kaiju(name);
		} else if (typeK == 2) {
			String name = sc.next();
			String Category = sc.next();
			int Height = sc.nextInt();
			int Weight = sc.nextInt();
			String strp = sc.nextLine();
			strp = sc.nextLine();
			String Power[] = strp.split(",");
			String Description = sc.nextLine();
			k = new Kaiju(name, Category, Height, Weight, Power, Description);
		}

		int typeJ = sc.nextInt();

		if (typeJ == 0) {
			j = new Jaeger();
		} else if (typeJ == 1) {
			String t = sc.nextLine();
			String name = sc.nextLine();
			j = new Jaeger(name);
		} else if (typeJ == 2) {
			String temp = sc.nextLine();
			String name = sc.nextLine();
			String CoO = sc.nextLine();
			int mark = sc.nextInt();
			double h = sc.nextDouble();
			temp = sc.nextLine();
			String str = sc.nextLine();
			String strp[] = str.split(",");
			String str2 = sc.nextLine();
			String strw[] = str2.split(",");
			j = new Jaeger(name, CoO, mark, h, strp, strw);
		}

		System.out.println("====================");
		j.PrintDetail();
		System.out.println("VS");
		k.PrintDetail();
		System.out.println("====================");

	}

}
