/* �޴� Ŭ���� */
class Menu{

		/*���� �޴��� ����(�ִ� �ε�����) static int menuIndex = 0;*/
		/*�޴� �̸�*/ private String menuName;
		/*�޴� ����*/ private int menuPrice;
		
		String si = Integer.toString(CafeTest.id);
		
		/*�ʱ� ������*/
		public Menu() {
			this.menuName = null;
			this.menuPrice = 0;
		}
		
		/*����ڿ� ���� ����*/
		public void reMenu(String name, int price){
			this.menuName = name;
			this.menuPrice = price;
		}
		
		/*�޴� �̸� ���� setter method*/
		public void setMenuName(String name) {
			this.menuName = name;
		}
		/*�޴� ���� ���� setter method*/
		public void setMenuPrice(int price) {
			this.menuPrice = price;
		}
		
		/*�޴� �̸� getter*/
		public String getMenuName() {
			if(menuName!=null) {
				return this.menuName;	
			}else {
				return "";
			}
		}
		/*�޴� ���� getter*/
		public int getMenuPrice() {
			return this.menuPrice;
		}
		
		/*�޴� ���� method*/
		public void deleteMenu() {
			this.menuName = null;
			this.menuPrice = 0;
		}
}
