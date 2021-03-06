package view;

import java.util.Scanner;

import controller.Controllers;

public class MainView {

	private Scanner keyboard;

	public MainView() {
		keyboard = new Scanner(System.in);
	}

	public void mainView() {

		//치킨 메뉴 호출해주기 설명없는 거로

		System.out.println("[1]  메  뉴  조  회  ");
		System.out.println("[2]  로     그    인  ");
		System.out.println("[3]  비회원  주 문  ");
		System.out.println("[4]  주  문  내  역  ");
		System.out.println("[5]  회  원  가  입  ");
		System.out.println("[0]   종       료     ");

		int mainViewNumber = keyboard.nextInt();
		if(mainViewNumber == 1){

		}else if(mainViewNumber == 2){
			Controllers.getLoginController().requestLogin(); //로그인 메서드 호출
		}else if(mainViewNumber == 3){
			Controllers.getNonUserController().requestNonUserRegister(); // 비회원 주문 메서드 호출
		}else if(mainViewNumber == 4){

		}else if(mainViewNumber == 5){
			Controllers.getUserController().requestRegister(); //회원가입
		}else if(mainViewNumber == 0){
			System.out.println("[  꼬끼오 치킨 쇼핑을 종료합니다. ] ");
			System.exit(0);
		}else {
			Controllers.getMainController().requestMainView();
		}
	}

	public void userMainView() {

		//치킨 메뉴 호출해주기 설명없는 거로

		System.out.println("[1] 메  뉴  조  회  ");
		System.out.println("[2] 장  바  구  니  ");
		System.out.println("[3] 내     정    보  ");
		System.out.println("[4] 로  그  아  웃  ");

		int userMainViewNumber = keyboard.nextInt();
		if(userMainViewNumber == 1){
			//시험삼아 결제 추가
			Controllers.getPaymentController().requestUserRegister();
		}else if(userMainViewNumber == 2){
			Controllers.getCartController().requestCartList();
		}else if(userMainViewNumber == 3){
			Controllers.getUserController().requestUserInfo();
		}else if(userMainViewNumber == 4){
			Controllers.getLoginController().requestLogout();
		}else {
			Controllers.getMainController().requestUserMainView();
		}
	}

	public void nonUserMainView() {

		//치킨 메뉴 호출해주기 설명없는 거로

		System.out.println("[1] 메  뉴  조  회  ");
		System.out.println("[2] 장  바  구  니  ");
		System.out.println("[3] 메  인  화  면  ");

		int nonUserMainViewNumber = keyboard.nextInt();
		if(nonUserMainViewNumber == 1){

		}else if(nonUserMainViewNumber == 2){

		}else if(nonUserMainViewNumber == 3){
			Controllers.getMainController().requestMainView();
		}else {
			Controllers.getMainController().requestNonUserMainView();
		}
	}

}
