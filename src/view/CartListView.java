package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.Controllers;
import domain.Cart;

public class CartListView {

	private Scanner keyboard;
	
	public CartListView() {

		keyboard = new Scanner(System.in);
		
	}

	public void printCartList(ArrayList<Cart> carts) {

		int sum = 0;

		System.out.println("\n[*] 장  바  구  니    목   록 [*]\n");
		System.out.println("장바구니번호   제품이름\t주문수량\t가격\t합계금액");

		if (carts.size() == 0) {
			System.out.println("\n[*]장  바  구  니  가      비  어  있  습  니  다[*]\n");
		}
		for (int i = 0; i < carts.size(); i++) {
			System.out.print(carts.get(i).getCartNumber() + "\t");
			System.out.print(carts.get(i).getProductName() + "\t");
			System.out.print(carts.get(i).getOrderAmount() + "\t");
			System.out.print(carts.get(i).getProductPrice() + "\t");
			System.out.println(carts.get(i).getOrderAmount() * carts.get(i).getProductPrice());

			sum = sum + (carts.get(i).getOrderAmount() * carts.get(i).getProductPrice());

			System.out.println("총 금액 : " + sum + "\n");
		}
		Controllers.getCartController().requestUserCartView();

	}

	public void userCartView() {
		
		//장바구니 목록에 출력되는 메뉴
		
		System.out.println("[1] 제     품      목   록   ");
		System.out.println("[2] 상     품      주   문   ");
		System.out.println("[3] 상     품      수   정   ");
		System.out.println("[4] 상     품      취   소   ");
		
		
		
		int selectedMenu = keyboard.nextInt();

		switch (selectedMenu) {
		case 1:
			new AlertView().alert("제품 컨트롤러에 제품 목록 보기를 요청함.");
//			Controllers.getProductController().requestSelectList();
			break;
		case 2:
			new AlertView().alert("주문 컨트롤러에 주문를 요청함.");
//			Controllers.getOrderController().requestRegister();
			break;
		case 3:
			new AlertView().alert("장바구니 컨트롤러에 장바구니 상품 수정을 요청함.");
			Controllers.getCartController().requestUpdateOrderAmount(); 
			break;
		case 4:
			new AlertView().alert("장바구니 컨트롤러에 장바구니 상품 삭제를 요청함.");
			Controllers.getCartController().requestCartDeleteOne();
			break;
		
		case 0:
			new AlertView().alert("프로그램 컨트롤러에 프로그램 종료를 요청함.");
			Controllers.getProgramController().requestExitProgram();
			break;
		default:
			new AlertView().alert("[*] 메 뉴 를 다 시 선 택 해 주 세 요  [*]");
		}
	}
	
}
