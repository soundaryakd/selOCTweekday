package wwek2.day2;



	public class Desktop implements Hardware,Software {

		public void softwareResources() {
			System.out.println("softwareresources");
			
		}

		public void hardwareResources() {
			System.out.println("hardware");
			
		}
		public void desktopModel() {
			System.out.println("Desktop");
		}
		public static void main(String[] args) {
			Desktop dd = new Desktop();
			dd.softwareResources();
			dd.hardwareResources();
			dd.desktopModel();
		}

	}


