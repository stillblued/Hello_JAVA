package com.yedam.RestaurantPlz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Restaurant extends JFrame {

	private static JPanel contentPane;

	private String name; // 가게 이름

	private int money = 100; // 초기 자본

	protected int exp = 0; // 경험치

	protected int level = 1; // 레벨

	protected static final int STANDARD = 10; // 소지금, 경험치, 레벨 기준점

	private static final String[] STUFF = { "빵가루", "부침가루", "빵", "밥", "밀가루", "파스타", "계란", "우유", "버터", "생크림", "치즈", "얼음",
			"포도주", "젤라틴", "후추", "발사믹", "굴소스", "메이플시럽", "쯔유", "머스타드", "월계수", "콘소메", "생강", "사프란", "김치", "피클", "닭고기",
			"돼지고기", "소고기", "햄", "베이컨", "소세지", "생선", "오징어", "새우", "조개", "딸기", "옥수수", "토마토", "가지", "대파", "시금치", "양송이",
			"파프리카", "양파", "감자", "당근", "애호박", "양배추", "바질", "루꼴라", "샐러리" }; // 식재료 목록

	private JCheckBox[] box = new JCheckBox[STUFF.length]; // 식재료 체크박스

	protected ArrayList<String> cook = new ArrayList<String>(); // 요리할 배열

	private static final String[] MENU = { "딸기셔벗", "와인젤리", "팝콘", "스크램블에그", "코코뱅", "포크커틀릿", "고로케", "김치전", "핫도그", "라따뚜이",
			"잠봉뵈르", "샤오롱바오", "까르보나라", "바질스프", "카프레제", "새우필라프", "팬케이크", "규동", "비프부르기뇽", "시금치키슈", "빠에야", "비프웰링턴", "부이야베스",
			"포토푀", "버섯라비올리" }; // 메뉴 목록

	Customer custom = Customer.getType(level); // 난이도 변경

	public int menuIndex = custom.getRandom(); // 메뉴 인덱스

	protected String explain = custom.getCustomer(menuIndex);; // 메뉴 설명

	// ============================================================================================

	private void fabi() { // 파비콘
		Image image = null;
		try {
			image = ImageIO.read(new File("src/main/java/image/apple.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setIconImage(image);
	}

	private static void customcursor() { // 커서
		Toolkit tk = Toolkit.getDefaultToolkit();
		Image cursorimage = tk.getImage("src/main/java/image/apple.png");
		Point point = new Point(0, 0);
		Cursor cursor = tk.createCustomCursor(cursorimage, point, "Yummy~");
		contentPane.setCursor(cursor);
	}

	private static void bgm() { // 배경음
		try {
			AudioInputStream ais = AudioSystem.getAudioInputStream(new File("src/main/java/sound/Pixelland.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(ais);
			clip.loop(Clip.LOOP_CONTINUOUSLY);
			FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			gainControl.setValue(-10.0f);
			clip.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private int getLevel() { // 레벨 조정
		if (exp >= STANDARD * 20) {
			return level = 5;
		} else if (exp >= STANDARD * 15) {
			return level = 4;
		} else if (exp >= STANDARD * 10) {
			return level = 3;
		} else if (exp >= STANDARD * 5) {
			return level = 2;
		} else {
			return level = 1;
		}
	}

	// ============================================================================================

	public Restaurant() {

		setBackground(new Color(255, 250, 205));
		setFont(new Font("맑은 고딕", Font.BOLD, 15));
		setTitle("레스토랑을 부탁해!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 100, 1025, 772);
		setLocationRelativeTo(null);
		setResizable(false);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		customcursor();
		fabi();
		bgm();

		// ============================================================================================

		JPanel storyPanel2 = new JPanel();
		storyPanel2.setBackground(Color.WHITE);
		storyPanel2.setBounds(80, 75, 850, 580);
		storyPanel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		contentPane.add(storyPanel2);
		storyPanel2.setLayout(null);
		storyPanel2.setVisible(false);

		JPanel storyPanel1 = new JPanel();
		storyPanel1.setBackground(Color.WHITE);
		storyPanel1.setBounds(80, 75, 850, 580);
		storyPanel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		contentPane.add(storyPanel1);
		storyPanel1.setLayout(null);
		storyPanel1.setVisible(false);

		JPanel startPanel = new JPanel();
		startPanel.setBackground(Color.WHITE);
		startPanel.setBounds(80, 75, 850, 580);
		startPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		contentPane.add(startPanel);
		startPanel.setLayout(null);
		startPanel.setVisible(true);

		JPanel cooking = new JPanel();
		cooking.setBackground(Color.WHITE);
		cooking.setBounds(80, 75, 850, 580);
		cooking.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		cooking.setLayout(null);

		JPanel serving = new JPanel();
		serving.setBackground(Color.WHITE);
		serving.setBounds(80, 75, 850, 580);
		serving.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		serving.setLayout(null);

		JTabbedPane tab = new JTabbedPane(JTabbedPane.TOP);
		tab.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		tab.setBackground(Color.WHITE);
		tab.setBounds(80, 75, 850, 580);
		contentPane.add(tab);
		tab.setVisible(false);
		tab.add(serving, 0);
		tab.add(cooking, 1);

		// ============================================================================================

		JButton sttBtn = new JButton();
		sttBtn.setBackground(new Color(240, 230, 140));
		sttBtn.setIcon(new ImageIcon(Restaurant.class.getResource("/image/house.png")));
		sttBtn.setBounds(126, 64, 596, 449);
		sttBtn.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		startPanel.add(sttBtn);
		startPanel.setVisible(true);
		sttBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				startPanel.setVisible(false);
				storyPanel1.setVisible(true);
			}
		});

		JButton exitBtn = new JButton();
		exitBtn.setBackground(Color.WHITE);
		exitBtn.setIcon(new ImageIcon(Restaurant.class.getResource("/image/over.png")));
		exitBtn.setBounds(347, 239, 314, 250);
		exitBtn.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		contentPane.add(exitBtn);
		exitBtn.setVisible(false);
		exitBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		JButton endBtn = new JButton();
		endBtn.setBackground(Color.WHITE);
		endBtn.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		endBtn.setIcon(new ImageIcon(Restaurant.class.getResource("/image/end.png")));
		endBtn.setBounds(346, 157, 312, 326);
		contentPane.add(endBtn);
		endBtn.setVisible(false);
		endBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		// --------------------------------------------------------------------------------------------

		JLabel strPerson = new JLabel();
		strPerson.setBackground(Color.WHITE);
		strPerson.setBounds(250, 128, 116, 159);
		strPerson.setIcon(new ImageIcon(Restaurant.class.getResource("/image/person.png")));
		storyPanel1.add(strPerson);

		JLabel strDog1 = new JLabel();
		strDog1.setBackground(Color.WHITE);
		strDog1.setBounds(450, 158, 116, 102);
		strDog1.setIcon(new ImageIcon(Restaurant.class.getResource("/image/dog(2).gif")));
		storyPanel1.add(strDog1);

		JPanel strBox1 = new JPanel();
		strBox1.setBackground(new Color(255, 250, 205));
		strBox1.setBounds(65, 312, 718, 222);
		strBox1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		storyPanel1.add(strBox1);
		strBox1.setLayout(null);

		JLabel strTxt = new JLabel("길바닥에 강아지가 쓰러져 있다…. Σ(°ロ°)");
		strTxt.setBackground(Color.WHITE);
		strTxt.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		strTxt.setBounds(163, 55, 391, 40);
		strBox1.add(strTxt);

		RoundedButton overBtn = new RoundedButton("2. 모른척 지나친다~");
		overBtn.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		overBtn.setBounds(429, 127, 175, 40);
		strBox1.add(overBtn);
		overBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				exitBtn.setVisible(true);
				storyPanel1.setVisible(false);
			}
		});

		RoundedButton strBtn = new RoundedButton("1. 먹을 것을 준다!");
		strBtn.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		strBtn.setBounds(128, 127, 167, 40);
		strBox1.add(strBtn);
		strBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				storyPanel1.setVisible(false);
				storyPanel2.setVisible(true);
			}
		});

		// --------------------------------------------------------------------------------------------

		JLabel strDog2 = new JLabel();
		strDog2.setIcon(new ImageIcon(Restaurant.class.getResource("/image/dog(3).gif")));
		strDog2.setBackground(Color.WHITE);
		strDog2.setBounds(286, 94, 229, 169);
		storyPanel2.add(strDog2);

		JPanel strBox2_1 = new JPanel();
		strBox2_1.setBackground(new Color(255, 250, 205));
		strBox2_1.setBounds(64, 312, 719, 221);
		strBox2_1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		storyPanel2.add(strBox2_1);
		strBox2_1.setLayout(null);

		JLabel strName2 = new JLabel("【 종을 알 수 없는 강아지 】 ");
		strName2.setBounds(36, 22, 336, 34);
		strName2.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		strBox2_1.add(strName2);

		JLabel strTxt2_1 = new JLabel("덕분에 살았다멍! ＼（＾▽＾)/ 나는 미식의 별 YD-4GangUisil에서 온 예담이다멍!");
		strTxt2_1.setBounds(36, 66, 647, 34);
		strTxt2_1.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		strBox2_1.add(strTxt2_1);

		JLabel strTxt2_2 = new JLabel("은혜를 입었으니 보답으로 천재적인 '간조절', '물조절', '불조절' 능력을 주겠다멍!");
		strTxt2_2.setBounds(36, 110, 647, 34);
		strTxt2_2.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		strBox2_1.add(strTxt2_2);

		JPanel strBox2_2 = new JPanel();
		strBox2_2.setBackground(new Color(255, 250, 205));
		strBox2_2.setBounds(64, 312, 719, 221);
		strBox2_2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		storyPanel2.add(strBox2_2);
		strBox2_2.setLayout(null);
		strBox2_2.setVisible(false);

		RoundedButton strBtn2 = new RoundedButton("☞ 네?!?");
		strBtn2.setBounds(554, 154, 115, 34);
		strBtn2.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		strBox2_1.add(strBtn2);
		strBtn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				strBox2_1.setVisible(false);
				strBox2_2.setVisible(true);
			}
		});

		JLabel strTxt2_3 = new JLabel("신난다! 이제 코딩 공부는 접고 요식업계의 큰손이 되어야지!");
		strTxt2_3.setBounds(62, 45, 607, 34);
		strTxt2_3.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		strBox2_2.add(strTxt2_3);

		JLabel strTxt2_4 = new JLabel("가게 이름은 뭐라고 지을까?  へ(￣∇￣へ)");
		strTxt2_4.setBounds(62, 89, 480, 34);
		strTxt2_4.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		strBox2_2.add(strTxt2_4);

		JTextField inputName = new JTextField();
		inputName.setBounds(343, 154, 199, 34);
		inputName.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		strBox2_2.add(inputName);
		inputName.setColumns(20);

		RoundedButton nameBtn = new RoundedButton("☞ 창업");
		nameBtn.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		nameBtn.setBounds(554, 154, 115, 34);
		strBox2_2.add(nameBtn);
		nameBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				storyPanel2.setVisible(false);
				tab.setVisible(true);
				name = inputName.getText();
				tab.setTitleAt(0, name);
				tab.setTitleAt(1, "요리하기");
			}
		});

		// ============================================================================================

		JPanel showCustomer = new JPanel();
		showCustomer.setBackground(new Color(153, 204, 255));
		showCustomer.setBounds(47, 37, 754, 263);
		showCustomer.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		serving.add(showCustomer);
		showCustomer.setLayout(null);

		JTextArea explainMenu = new JTextArea(explain);
		explainMenu.setBounds(27, 16, 485, 231);
		explainMenu.setForeground(Color.BLACK);
		explainMenu.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		explainMenu.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		explainMenu.setLineWrap(true);
		showCustomer.add(explainMenu);
		explainMenu.setEnabled(false);

		JLabel customer1 = new JLabel();
		customer1.setHorizontalAlignment(SwingConstants.CENTER);
		customer1.setIcon(new ImageIcon(Restaurant.class.getResource("/image/person1.png")));
		customer1.setBounds(531, 31, 200, 200);
		showCustomer.add(customer1);
		customer1.setVisible(true);

		JLabel customer2 = new JLabel();
		customer2.setHorizontalAlignment(SwingConstants.CENTER);
		customer2.setIcon(new ImageIcon(Restaurant.class.getResource("/image/person2.png")));
		customer2.setBounds(531, 31, 200, 200);
		showCustomer.add(customer2);
		customer2.setVisible(false);

		JLabel customer3 = new JLabel();
		customer3.setHorizontalAlignment(SwingConstants.CENTER);
		customer3.setIcon(new ImageIcon(Restaurant.class.getResource("/image/person3.png")));
		customer3.setBounds(531, 31, 200, 200);
		showCustomer.add(customer3);
		customer3.setVisible(false);

		JLabel customer4 = new JLabel();
		customer4.setHorizontalAlignment(SwingConstants.CENTER);
		customer4.setIcon(new ImageIcon(Restaurant.class.getResource("/image/person4.png")));
		customer4.setBounds(531, 31, 200, 200);
		showCustomer.add(customer4);
		customer4.setVisible(false);

		JLabel customer5 = new JLabel();
		customer5.setHorizontalAlignment(SwingConstants.CENTER);
		customer5.setIcon(new ImageIcon(Restaurant.class.getResource("/image/person5.png")));
		customer5.setBounds(531, 31, 200, 200);
		showCustomer.add(customer5);
		customer5.setVisible(false);

		JPanel theDog = new JPanel();
		theDog.setBackground(new Color(240, 248, 255));
		theDog.setBounds(47, 325, 516, 188);
		theDog.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		serving.add(theDog);
		theDog.setLayout(null);

		JLabel dogDancing = new JLabel();
		dogDancing.setHorizontalAlignment(SwingConstants.CENTER);
		dogDancing.setBounds(147, 14, 221, 160);
		dogDancing.setIcon(new ImageIcon(Restaurant.class.getResource("/image/dog(1).gif")));
		theDog.add(dogDancing);
		dogDancing.setVisible(false);

		JLabel dogDefault = new JLabel();
		dogDefault.setHorizontalAlignment(SwingConstants.CENTER);
		dogDefault.setBounds(154, 51, 208, 127);
		dogDefault.setIcon(new ImageIcon(Restaurant.class.getResource("/image/dog(5).gif")));
		theDog.add(dogDefault);

		JPanel moneyPanel = new JPanel();
		moneyPanel.setBackground(new Color(240, 248, 255));
		moneyPanel.setBounds(597, 466, 204, 47);
		moneyPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		serving.add(moneyPanel);
		moneyPanel.setLayout(null);

		JTextArea showMoney = new JTextArea(String.valueOf(money));
		showMoney.setForeground(Color.BLACK);
		showMoney.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		showMoney.setBounds(12, 10, 180, 27);
		moneyPanel.add(showMoney);
		showMoney.setEnabled(false);

		JPanel status = new JPanel();
		status.setBackground(new Color(240, 248, 255));
		status.setBounds(544, 31, 230, 482);
		status.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		cooking.add(status);
		status.setLayout(null);

		JTextArea showM = new JTextArea(String.valueOf(money));
		showM.setBounds(27, 375, 175, 33);
		status.add(showM);
		showM.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		showM.setForeground(Color.BLACK);
		showM.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		showM.setEnabled(false);

		JComboBox<String> menuBox = new JComboBox<String>();
		menuBox.setBackground(new Color(240, 248, 255));
		menuBox.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		menuBox.setBounds(597, 325, 204, 37);
		serving.add(menuBox);

		RoundButton servingBtn = new RoundButton("1. 서빙하기");
		servingBtn.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		servingBtn.setBounds(597, 372, 204, 37);
		serving.add(servingBtn);
		servingBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String x = menuBox.getSelectedItem().toString();
				String y = MENU[menuIndex];

				if (x == y) {

					money += (STANDARD * 3);
					showMoney.setText(String.valueOf(money));
					showM.setText(String.valueOf(money));

					exp += STANDARD;
					getLevel();
					Customer custom = Customer.getType(level);
					JOptionPane.showMessageDialog(null, "여기 계산이요! ^_^ +30P +10exp");

					int num = ((int) (Math.random() * 5) + 1);

					switch (num) {
					case 1:
						customer1.setVisible(true);
						customer2.setVisible(false);
						customer3.setVisible(false);
						customer4.setVisible(false);
						customer5.setVisible(false);
						break;
					case 2:
						customer1.setVisible(false);
						customer2.setVisible(true);
						customer3.setVisible(false);
						customer4.setVisible(false);
						customer5.setVisible(false);
						break;
					case 3:
						customer1.setVisible(false);
						customer2.setVisible(false);
						customer3.setVisible(true);
						customer4.setVisible(false);
						customer5.setVisible(false);
						break;
					case 4:
						customer1.setVisible(false);
						customer2.setVisible(false);
						customer3.setVisible(false);
						customer4.setVisible(true);
						customer5.setVisible(false);
						break;
					case 5:
						customer1.setVisible(false);
						customer2.setVisible(false);
						customer3.setVisible(false);
						customer4.setVisible(false);
						customer5.setVisible(true);
						break;
					}

					menuIndex = custom.getRandom();
					explain = custom.getCustomer(menuIndex);
					explainMenu.removeAll();
					explainMenu.setText(explain);

					if (money > STANDARD * 100) {
						endBtn.setVisible(true);
						tab.setVisible(false);
					}
					;
				} else {
					JOptionPane.showMessageDialog(null, "ㅡ_ㅡ 이런 거 안 시켰어요!");
				}
				menuBox.removeItem(x);
			}
		});

		RoundButton feedingBtn = new RoundButton("2. 개밥주기");
		feedingBtn.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		feedingBtn.setBounds(597, 419, 204, 37);
		serving.add(feedingBtn);
		feedingBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				String z = menuBox.getSelectedItem().toString();
				menuBox.removeItem(z);

				int num = ((int) (Math.random() * 2) + 1);

				switch (num) {

				case 1:
					dogDancing.setVisible(false);
					dogDefault.setVisible(true);
					JOptionPane.showMessageDialog(null, "념념굿. ㅇㅅㅇ");
					break;

				case 2:
					dogDefault.setVisible(false);
					dogDancing.setVisible(true);
					JOptionPane.showMessageDialog(null, "예담이가 기뻐한다! +10P");
					money += STANDARD;
					showMoney.setText(String.valueOf(money));
					showM.setText(String.valueOf(money));
					break;
				}
			}
		});

		// ============================================================================================

		JPanel ingredient = new JPanel();
		ingredient.setBounds(73, 31, 459, 482);
		ingredient.setBackground(new Color(240, 248, 255));
		cooking.add(ingredient);
		ingredient.setLayout(new GridLayout(13, 4, 5, 5));

		JLabel resultFood = new JLabel();
		resultFood.setBounds(56, 409, 117, 63);
		status.add(resultFood);
		resultFood.setHorizontalAlignment(SwingConstants.CENTER);
		resultFood.setIcon(new ImageIcon(Restaurant.class.getResource("/image/food.png")));
		resultFood.setVisible(false);

		JLabel dogFood = new JLabel();
		dogFood.setBounds(56, 409, 117, 63);
		status.add(dogFood);
		dogFood.setHorizontalAlignment(SwingConstants.CENTER);
		dogFood.setIcon(new ImageIcon(Restaurant.class.getResource("/image/dogFood.png")));
		dogFood.setVisible(false);

		JLabel cookcook = new JLabel();
		cookcook.setHorizontalAlignment(SwingConstants.CENTER);
		cookcook.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		cookcook.setIcon(new ImageIcon(Restaurant.class.getResource("/image/cooking.gif")));
		cookcook.setBounds(27, 26, 175, 116);
		status.add(cookcook);

		JLabel uncook = new JLabel();
		uncook.setHorizontalAlignment(SwingConstants.CENTER);
		uncook.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		uncook.setIcon(new ImageIcon(Restaurant.class.getResource("/image/uncook.gif")));
		uncook.setBounds(28, 252, 174, 104);
		status.add(uncook);

		for (int i = 0; i < STUFF.length; i++) {
			box[i] = new JCheckBox(STUFF[i]);
			box[i].setFont(new Font("맑은 고딕", Font.BOLD, 15));
			box[i].setBackground(new Color(204, 229, 255));
			ingredient.add(box[i]);
		}

		RoundButton cookBtn = new RoundButton("☞ 요리하기");
		cookBtn.setBounds(27, 162, 175, 68);
		status.add(cookBtn);
		cookBtn.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		cookBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < STUFF.length; i++) {
					if (box[i].isSelected()) {
						cook.add(STUFF[i]);
					}
					box[i].setSelected(false);
				}
				Collections.sort(cook);
				menuBox.addItem(Recipe.check(cook));

				if (Recipe.check(cook) == "개밥") {
					dogFood.setVisible(true);
					resultFood.setVisible(false);
					JOptionPane.showMessageDialog(null, "개밥이 되었다.. -10P");
				} else if (money < 10) {
					tab.setVisible(false);
					exitBtn.setVisible(true);
					JOptionPane.showMessageDialog(null, "파산!");
				}

				else {
					dogFood.setVisible(false);
					resultFood.setVisible(true);
					JOptionPane.showMessageDialog(null, "요리 성공!! -10P");
				}
				money -= STANDARD;
				cook.clear();

				showMoney.setText(String.valueOf(money));
				showM.setText(String.valueOf(money));
			}

		});

		// ============================================================================================

		JLabel bgImg = new JLabel();
		bgImg.setBackground(new Color(255, 250, 205));
		bgImg.setIcon(new ImageIcon(Restaurant.class.getResource("/image/tile_background.png")));
		bgImg.setBounds(0, 0, 1010, 730);
		contentPane.add(bgImg);

	}

}
