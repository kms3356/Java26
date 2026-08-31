package app;

import java.util.Scanner;

import account.AccountListDao;
import account.AccountService;
import member.Member;
import member.MemberMapDao;
import member.MemberService;

public class ConsoleBank {
	
	Scanner sc = new Scanner(System.in);
	AccountService as;
	MemberService ms;
	
	String[] startMenu = {"종료", "로그인", "회원가입"};
	String[] adminMenu = {"로그아웃", "회원관리", "계좌관리"};
	String[] bankingMenu = {"로그아웃", "계좌목록", "입금", "출금", "계좌생성", "계좌해지", "내정보"};
	String[] myinfoMenu = {"돌아가기", "비밀번호수정", "회원탈퇴"};
	String[] adminMemberMenu = {"돌아가기", "회원목록", "회원강퇴"};
	String[] adminAccountMenu = {"돌아가기", "전체계좌목록", "회원별계좌목록"};

	public ConsoleBank(AccountService as, MemberService ms) {
		this.as = as;
		this.ms = ms;
	}
	
	public static void main(String[] args) {
		AccountService as = new AccountService(new AccountListDao());
		MemberService ms = new MemberService(new MemberMapDao());
		ConsoleBank consoleBank = new ConsoleBank(as, ms);
		
		consoleBank.welcomeMessage();
		consoleBank.runStartMenu();
		consoleBank.sayGoodbye();
		
	}
	
	private void welcomeMessage() {
		System.out.println("+------------------------------------+");
		System.out.println("  Welcome to Minseok's Console Bank ");
		System.out.println("+------------------------------------+");
		
	}

	private void sayGoodbye() {
		System.out.println(">> Minseok's Console Bank를 이용해 주셔서 감사합니다.");
		
	}
	
	private void runStartMenu() {
		
		while (true) {
			System.out.println("[[ 시작 메뉴 ]]");
			int menu = selectMenu(startMenu);
			switch (menu) {
			case 1:
				menuLogin(); break;
			case 2:
				menuJoin(); break;
			case 0:
				return;
			default:
				System.out.println("메뉴에 있는 번호를 입력하세요.");
			}
		}
		
	}
	
	private int selectMenu(String[] menuList) {
		System.out.println("==========================");
		for (int i = 1; i < menuList.length; i++)
			System.out.println(" " + i + ". " + menuList[i]);
		System.out.println(" 0. " + menuList[0]);
		System.out.println("==========================");
		System.out.print(">> 선택 : ");
		int menu = Integer.parseInt(sc.nextLine());
		return menu;
	}

	private void menuLogin() {
		System.out.println("[[ 로그인 ]]");
		System.out.print(">> 아이디 : ");
		String id = sc.nextLine();
		System.out.print(">> 비밀번호 : ");
		String password = sc.nextLine();
		
		// 로그인 처리 후 로그인한 멤버 유형에 맞는 메뉴 실행
		if (ms.login(id, password)) {
			Member m = ms.getLoginMember();
			if (m.getId().equals(ms.getAdminId()))
				runAdminMenu();
			else {
				runBankingMenu();
			}
		} else {
			System.out.println(">> 로그인 할 수 없습니다.");
		}
		
	}

	private void menuJoin() {
		// TODO Auto-generated method stub
		
	}

	private void runAdminMenu() {

		while (true) {
			System.out.println("[[ 관리자 메뉴 ]]");
			int menu = selectMenu(adminMenu);
			switch (menu) {
			case 1: // 회원관리
				runAdminMemberMenu(); break;
			case 2: // 계좌관리
				runAdminAccountMenu(); break;
			case 0:
				return;
			default:
				System.out.println("메뉴에 있는 번호를 입력하세요.");
			}
		}
		
	}

	private void runAdminMemberMenu() {
		while (true) {
			System.out.println("[[ 관리자용 회원관리 ]]");
			int menu = selectMenu(adminMemberMenu);
			switch (menu) {
			case 1: // 회원 목록
				menuAdminListMembers(); break;
			case 2: // 회원 강퇴
				menuAdminDeleteMember(); break;
			case 0:
				return;
			default:
				System.out.println("메뉴에 있는 번호를 입력하세요.");
			}
		}
		
	}

	private void menuAdminListMembers() {
		// TODO Auto-generated method stub
		
	}

	private void menuAdminDeleteMember() {
		// TODO Auto-generated method stub
		
	}

	private void runAdminAccountMenu() {
		while (true) {
			System.out.println("[[ 관리자용 계좌관리 ]]");
			int menu = selectMenu(adminAccountMenu);
			switch (menu) {
			case 1: // 전체 계좌 목록
				menuAdminListAllAccounts(); break;
			case 2: // 회원 계좌 목록
				menuAdminListMemberAccounts(); break;
			case 0:
				return;
			default:
				System.out.println("메뉴에 있는 번호를 입력하세요.");
			}
		}
		
	}


	private void menuAdminListAllAccounts() {
		// TODO Auto-generated method stub
		
	}

	private void menuAdminListMemberAccounts() {
		// TODO Auto-generated method stub
		
	}

	private void runBankingMenu() {
		while (true) {
			System.out.println("[[ 은행 메뉴 ]]");
			int menu = selectMenu(bankingMenu);
			switch (menu) {
			case 1: // 내 계좌 목록
				menuListMyAccounts(); break;
			case 2: // 입금
				menuDeposit(); break;
			case 3: // 출금
				menuWithdraw(); break;
			case 4 : // 계좌생성
				menuCreateAccount(); break;
			case 5: // 계좌해지
				menuDeleteAccount(); break;
			case 6: // 내 정보
				runMyinfoMenu(); break;
			case 0:
				return;
			default:
				System.out.println("메뉴에 있는 번호를 입력하세요.");
			}
		}
		
	}

	private void menuListMyAccounts() {
		// TODO Auto-generated method stub
		
	}

	private void menuDeposit() {
		// TODO Auto-generated method stub
		
	}

	private void menuWithdraw() {
		// TODO Auto-generated method stub
		
	}

	private void menuCreateAccount() {
		// TODO Auto-generated method stub
		
	}

	private void menuDeleteAccount() {
		// TODO Auto-generated method stub
		
	}

	private void runMyinfoMenu() {
		while (true) {
			System.out.println("[[ 내 정보 메뉴 ]]");
			int menu = selectMenu(myinfoMenu);
			switch (menu) {
			case 1: // 비밀번호 수정
				menuUpdatePassword(); break;
			case 2: // 회원 탈퇴
				menuDeleteMembership(); break;
			case 0:
				return;
			default:
				System.out.println("메뉴에 있는 번호를 입력하세요.");
			}
		}
		
	}

	private void menuUpdatePassword() {
		// TODO Auto-generated method stub
		
	}

	private void menuDeleteMembership() {
		// TODO Auto-generated method stub
		
	}


}
