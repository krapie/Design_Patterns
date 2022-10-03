package chapter_09_composite;

public class MenuTestDrive {

    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("펜케이크 하우스 메뉴", "아침 메뉴");
        MenuComponent dinerMenu = new Menu("객체마을 식당 메뉴", "점심 메뉴");
        MenuComponent cafeMenu = new Menu("카페 메뉴", "저녁 메뉴");
        MenuComponent dessertMenu = new Menu("디저트 메뉴", "디저트를 즐겨보세요");

        MenuComponent allMenus = new Menu("전체 메뉴", "전체 메뉴");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        // 메뉴 항목 추가
        dinerMenu.add(new MenuItem("채식주의자용 BLT", "통밀 위에 (식물성)베이컨, 상추, 토마토를 얹은 메뉴", true, 2.99));
        dinerMenu.add(new MenuItem("BLT", "통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴", false, 2.99));
        dinerMenu.add(new MenuItem("오늘의 스프", "감자 샐러드를 곁들인 오늘의 스프", false, 3.29));
        dinerMenu.add(new MenuItem("핫도그", "사워크라우트, 갖은 양념, 양파, 치즈가 곁들여진 핫도그", false, 3.05));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("애플 파이", "바삭바삭한 크러스트에 바닐라 아이스크림이 얹혀 있는 애플 파이", true, 1.59));

        cafeMenu.add(new MenuItem("베지 버거와 에어 프라이", "통밀빵, 상추, 토마토, 감자 튀김이 첨가된 베지 버거", true, 3.99));
        cafeMenu.add(new MenuItem("오늘의 스프", "샐러드가 곁들여진 오늘의 소프", false, 3.69));
        cafeMenu.add(new MenuItem("부리토", "통 핀토콩과 살사, 구아카몰이 곁들여진 푸짐한 부리토", true, 4.29));

        pancakeHouseMenu.add(new MenuItem("K&B 팬케이크 세트", "스크램블드 에그와 토스트가 곁들여진 펜케이크", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("레귤러 팬케이크 세트", "달걀 후라이와 소시지가 곁들여진 펜케이크", false, 2.99));
        pancakeHouseMenu.add(new MenuItem("블루베리 펜케이크", "신선한 블루베리와 블루베리 시럽으로 만든 펜케이크", true, 3.49));
        pancakeHouseMenu.add(new MenuItem("와플", "와플, 취향에 따라 블루베리나 딸기를 얹을 수 있습니다.", true, 3.59));

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();
    }
}
