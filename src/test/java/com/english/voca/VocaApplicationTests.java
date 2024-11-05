package com.english.voca;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VocaApplicationTests {

	@Test


	@Test
	void contextLoads() {
		String newValue = value.replaceAll("\n\n\n\n", "123");
		newValue = newValue.replaceAll("\n", "\", \"");
		newValue = newValue.replaceAll("123", "\", false),\n(\"");
//		newValue = newValue.replaceAll("123", "\n");
		newValue = "INSERT INTO word (id, word, mean, book_mark) VALUES \n(\"" + newValue + "\", false);";

		String[] strings = newValue.split("\n");
		for (int i = 1; i < strings.length; i++) {
			String replacement = "(" + i + ", ";
			strings[i] = strings[i].replaceFirst("\\(", replacement);
		}
		for (String string : strings) {
			System.out.println(string);
		}
	}

	@Test
	void a() {
		System.out.println("(abc".replaceAll("\\(", "(1, "));
	}

	String value = "register\n" +
			"등록하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"affordable\n" +
			"적당한\n" +
			"\n" +
			"\n" +
			"\n" +
			"considerable\n" +
			"상당한\n" +
			"\n" +
			"\n" +
			"\n" +
			"accessible\n" +
			"접근할 수 있는\n" +
			"\n" +
			"\n" +
			"\n" +
			"significant\n" +
			"중요한, 상당한\n" +
			"\n" +
			"\n" +
			"\n" +
			"relevant\n" +
			"관련 있는\n" +
			"\n" +
			"\n" +
			"\n" +
			"informative\n" +
			"유익한\n" +
			"\n" +
			"\n" +
			"\n" +
			"productive\n" +
			"생산적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"extensive\n" +
			"폭넓은\n" +
			"\n" +
			"\n" +
			"\n" +
			"helpful\n" +
			"도움이 되는\n" +
			"\n" +
			"\n" +
			"\n" +
			"various\n" +
			"다양한\n" +
			"\n" +
			"\n" +
			"\n" +
			"regional\n" +
			"지역의\n" +
			"\n" +
			"\n" +
			"\n" +
			"operational\n" +
			"작동하는\n" +
			"\n" +
			"\n" +
			"\n" +
			"complimentary\n" +
			"무료의\n" +
			"\n" +
			"\n" +
			"\n" +
			"introductory\n" +
			"입문의, 서두의\n" +
			"\n" +
			"\n" +
			"\n" +
			"supplementary\n" +
			"보충의\n" +
			"\n" +
			"\n" +
			"\n" +
			"timely\n" +
			"시기적절한\n" +
			"\n" +
			"\n" +
			"\n" +
			"friendly\n" +
			"친절한\n" +
			"\n" +
			"\n" +
			"\n" +
			"be confident\n" +
			"~을 확신하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be reliant on\n" +
			"~에 의존하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be impressed with\n" +
			"~에 감명받다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be informed about\n" +
			"~을 통보받다, 잘 알다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be informed of\n" +
			"~을 통보받다, 잘 알다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be responsive to\n" +
			"~에 대응하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"one\n" +
			"하나의\n" +
			"\n" +
			"\n" +
			"\n" +
			"each\n" +
			"각각의\n" +
			"\n" +
			"\n" +
			"\n" +
			"every\n" +
			"모든\n" +
			"\n" +
			"\n" +
			"\n" +
			"another\n" +
			"또 다른\n" +
			"\n" +
			"\n" +
			"\n" +
			"many\n" +
			"많은\n" +
			"\n" +
			"\n" +
			"\n" +
			"few\n" +
			"거의 없는\n" +
			"\n" +
			"\n" +
			"\n" +
			"a few\n" +
			"약간의\n" +
			"\n" +
			"\n" +
			"\n" +
			"several\n" +
			"몇몇의\n" +
			"\n" +
			"\n" +
			"\n" +
			"both\n" +
			"둘 다\n" +
			"\n" +
			"\n" +
			"\n" +
			"a number of\n" +
			"수많은\n" +
			"\n" +
			"\n" +
			"\n" +
			"much\n" +
			"많은\n" +
			"\n" +
			"\n" +
			"\n" +
			"little\n" +
			"거의 없는\n" +
			"\n" +
			"\n" +
			"\n" +
			"a little\n" +
			"약간의\n" +
			"\n" +
			"\n" +
			"\n" +
			"a great deal of\n" +
			"다량의\n" +
			"\n" +
			"\n" +
			"\n" +
			"a great amount of\n" +
			"다량의\n" +
			"\n" +
			"\n" +
			"\n" +
			"all\n" +
			"모든\n" +
			"\n" +
			"\n" +
			"\n" +
			"most\n" +
			"대부분의\n" +
			"\n" +
			"\n" +
			"\n" +
			"other\n" +
			"다른\n" +
			"\n" +
			"\n" +
			"\n" +
			"some\n" +
			"약간의\n" +
			"\n" +
			"\n" +
			"\n" +
			"plenty of\n" +
			"다량의\n" +
			"\n" +
			"\n" +
			"\n" +
			"any\n" +
			"약간의, 아무\n" +
			"\n" +
			"\n" +
			"\n" +
			"no\n" +
			"하나도 없는\n" +
			"\n" +
			"\n" +
			"\n" +
			"summary\n" +
			"요약, 개요\n" +
			"\n" +
			"\n" +
			"\n" +
			"contribution\n" +
			"기부(금), 기여, 공헌\n" +
			"\n" +
			"\n" +
			"\n" +
			"reception\n" +
			"환영회, 연회, 접수처\n" +
			"\n" +
			"\n" +
			"\n" +
			"requtation\n" +
			"평판, 명성\n" +
			"\n" +
			"\n" +
			"\n" +
			"collection\n" +
			"수집품, 수거\n" +
			"\n" +
			"\n" +
			"\n" +
			"restriction\n" +
			"제한, 제약\n" +
			"\n" +
			"\n" +
			"\n" +
			"estimate\n" +
			"추정치, 견적서, 추산하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"preference\n" +
			"선호, 기호\n" +
			"\n" +
			"\n" +
			"\n" +
			"suggestion\n" +
			"제안, 제의\n" +
			"\n" +
			"\n" +
			"\n" +
			"location\n" +
			"지점, 위치\n" +
			"\n" +
			"\n" +
			"\n" +
			"revision\n" +
			"수정\n" +
			"\n" +
			"\n" +
			"\n" +
			"division\n" +
			"부서\n" +
			"\n" +
			"\n" +
			"\n" +
			"employment\n" +
			"고용\n" +
			"\n" +
			"\n" +
			"\n" +
			"equipment\n" +
			"장비\n" +
			"\n" +
			"\n" +
			"\n" +
			"membership\n" +
			"회원 (자격)\n" +
			"\n" +
			"\n" +
			"\n" +
			"tourism\n" +
			"관광업\n" +
			"\n" +
			"\n" +
			"\n" +
			"importance\n" +
			"중요성\n" +
			"\n" +
			"\n" +
			"\n" +
			"experience\n" +
			"경력, 경험\n" +
			"\n" +
			"\n" +
			"\n" +
			"rental\n" +
			"임대\n" +
			"\n" +
			"\n" +
			"\n" +
			"safety\n" +
			"안전\n" +
			"\n" +
			"\n" +
			"\n" +
			"supplier\n" +
			"공급 업체\n" +
			"\n" +
			"\n" +
			"\n" +
			"author\n" +
			"작가\n" +
			"\n" +
			"\n" +
			"\n" +
			"consultant\n" +
			"상담가\n" +
			"\n" +
			"\n" +
			"\n" +
			"resident\n" +
			"거주자, 주민\n" +
			"\n" +
			"\n" +
			"\n" +
			"job openings\n" +
			"일자리 공석\n" +
			"\n" +
			"\n" +
			"\n" +
			"staff assembly\n" +
			"직원 총회\n" +
			"\n" +
			"\n" +
			"\n" +
			"customer satisfaction\n" +
			"고객 만족\n" +
			"\n" +
			"\n" +
			"\n" +
			"benefits package\n" +
			"복리 후생 제도\n" +
			"\n" +
			"\n" +
			"\n" +
			"expiration date\n" +
			"만기일\n" +
			"\n" +
			"\n" +
			"\n" +
			"salese representative\n" +
			"영업 사원\n" +
			"\n" +
			"\n" +
			"\n" +
			"safety regulations\n" +
			"안전 규정\n" +
			"\n" +
			"\n" +
			"\n" +
			"funding\n" +
			"자금, 자금 제공\n" +
			"\n" +
			"\n" +
			"\n" +
			"staffing\n" +
			"직원 채용\n" +
			"\n" +
			"\n" +
			"\n" +
			"permit\n" +
			"허가증\n" +
			"\n" +
			"\n" +
			"\n" +
			"fund\n" +
			"자금, 자금을 대다\n" +
			"\n" +
			"\n" +
			"\n" +
			"permission\n" +
			"허가\n" +
			"\n" +
			"\n" +
			"\n" +
			"furniture\n" +
			"가구\n" +
			"\n" +
			"\n" +
			"\n" +
			"baggage\n" +
			"수화물\n" +
			"\n" +
			"\n" +
			"\n" +
			"product\n" +
			"제품\n" +
			"\n" +
			"\n" +
			"\n" +
			"merchandise\n" +
			"상품\n" +
			"\n" +
			"\n" +
			"\n" +
			"information\n" +
			"정보\n" +
			"\n" +
			"\n" +
			"\n" +
			"support\n" +
			"지원, 지지하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"experties\n" +
			"전문성\n" +
			"\n" +
			"\n" +
			"\n" +
			"panel\n" +
			"배심원단\n" +
			"\n" +
			"\n" +
			"\n" +
			"convenience\n" +
			"편리, 편의\n" +
			"\n" +
			"\n" +
			"\n" +
			"phase\n" +
			"단계, 단계적으로 하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"maintenance\n" +
			"유지, 보수\n" +
			"\n" +
			"\n" +
			"\n" +
			"priority\n" +
			"우선(권)\n" +
			"\n" +
			"\n" +
			"\n" +
			"certificate\n" +
			"증서, 자격증\n" +
			"\n" +
			"\n" +
			"\n" +
			"security\n" +
			"보안, 안전\n" +
			"\n" +
			"\n" +
			"\n" +
			"professional\n" +
			"전문가, 전문적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"assembly\n" +
			"조립, 집회\n" +
			"\n" +
			"\n" +
			"\n" +
			"architect\n" +
			"건축가\n" +
			"\n" +
			"\n" +
			"\n" +
			"initiative\n" +
			"계획, 주도권, 진취성\n" +
			"\n" +
			"\n" +
			"\n" +
			"associate\n" +
			"연상하다, 직원, 동료\n" +
			"\n" +
			"\n" +
			"\n" +
			"organize\n" +
			"조직하다, 준비하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"suitable\n" +
			"적절한, 적합한\n" +
			"\n" +
			"\n" +
			"\n" +
			"committee\n" +
			"위원회\n" +
			"\n" +
			"\n" +
			"\n" +
			"questionnaire\n" +
			"설문지\n" +
			"\n" +
			"\n" +
			"\n" +
			"valuable\n" +
			"소중한, 귀중한\n" +
			"\n" +
			"\n" +
			"\n" +
			"token\n" +
			"표시\n" +
			"\n" +
			"\n" +
			"\n" +
			"envelope\n" +
			"봉투\n" +
			"\n" +
			"\n" +
			"\n" +
			"efficiently\n" +
			"효율적으로\n" +
			"\n" +
			"\n" +
			"\n" +
			"positive\n" +
			"긍정적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"be famous for\n" +
			"~로 유명하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be suitable for\n" +
			"~에 적합하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be adequate for\n" +
			"~에 적합하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be familiar with\n" +
			"~에 익숙하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be agreeable to\n" +
			"~에 동의하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be accessible to\n" +
			"~에 접근할 수 있다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be subject to\n" +
			"~을 받기 쉽다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be capable of\n" +
			"~을 할 수 있다\n" +
			"\n" +
			"\n" +
			"\n" +
			"highly\n" +
			"매우\n" +
			"\n" +
			"\n" +
			"\n" +
			"await\n" +
			"기다리다\n" +
			"\n" +
			"\n" +
			"\n" +
			"matter\n" +
			"문제, 일\n" +
			"\n" +
			"\n" +
			"\n" +
			"retirement\n" +
			"은퇴, 퇴직\n" +
			"\n" +
			"\n" +
			"\n" +
			"decision\n" +
			"결정\n" +
			"\n" +
			"\n" +
			"\n" +
			"anniversary\n" +
			"기념일\n" +
			"\n" +
			"\n" +
			"\n" +
			"improvement\n" +
			"개선, 향상\n" +
			"\n" +
			"\n" +
			"\n" +
			"reservation\n" +
			"예약\n" +
			"\n" +
			"\n" +
			"\n" +
			"improve\n" +
			"개선하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"continue\n" +
			"지속하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"department\n" +
			"부서\n" +
			"\n" +
			"\n" +
			"\n" +
			"board meeting\n" +
			"이사회\n" +
			"\n" +
			"\n" +
			"\n" +
			"regular hours\n" +
			"정상 영업시간\n" +
			"\n" +
			"\n" +
			"\n" +
			"demand\n" +
			"수요, 요구하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"access\n" +
			"접근, 이용하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"ease\n" +
			"쉬움, 완화하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"increase\n" +
			"증가, 증가하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"purchase\n" +
			"구매(품), 구매하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"concern\n" +
			"걱정, 관심사\n" +
			"\n" +
			"\n" +
			"\n" +
			"receipt\n" +
			"영수증, 수령, 받음\n" +
			"\n" +
			"\n" +
			"\n" +
			"attendant\n" +
			"안내원, 수행원\n" +
			"\n" +
			"\n" +
			"\n" +
			"applicant\n" +
			"지원자\n" +
			"\n" +
			"\n" +
			"\n" +
			"supervisor\n" +
			"감독관, 관리자\n" +
			"\n" +
			"\n" +
			"\n" +
			"provider\n" +
			"공급자, 제공자\n" +
			"\n" +
			"\n" +
			"\n" +
			"unit price\n" +
			"단가\n" +
			"\n" +
			"\n" +
			"\n" +
			"perspective\n" +
			"관점\n" +
			"\n" +
			"\n" +
			"\n" +
			"particular\n" +
			"특정한, 특별한\n" +
			"\n" +
			"\n" +
			"\n" +
			"replacement\n" +
			"교체, 대체품, 후임자\n" +
			"\n" +
			"\n" +
			"\n" +
			"require\n" +
			"필요하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"revise\n" +
			"수정하다, 개정하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"employee\n" +
			"종업원, 고용인\n" +
			"\n" +
			"\n" +
			"\n" +
			"attend\n" +
			"참석하다, 출석하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"success\n" +
			"성공\n" +
			"\n" +
			"\n" +
			"\n" +
			"succeed\n" +
			"성공하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"must\n" +
			"~해야하다, ~일 것이다\n" +
			"\n" +
			"\n" +
			"\n" +
			"recommend\n" +
			"추천하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"recommendation\n" +
			"추천\n" +
			"\n" +
			"\n" +
			"\n" +
			"advance\n" +
			"전진, 다가서다, 사전의\n" +
			"\n" +
			"\n" +
			"\n" +
			"customer\n" +
			"손님, 고객\n" +
			"\n" +
			"\n" +
			"\n" +
			"available\n" +
			"구할 수 있는, 시간이 있는\n" +
			"\n" +
			"\n" +
			"\n" +
			"become\n" +
			"~가 되다\n" +
			"\n" +
			"\n" +
			"\n" +
			"accountant\n" +
			"회계사\n" +
			"\n" +
			"\n" +
			"\n" +
			"consider\n" +
			"고려하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"competent\n" +
			"능숙한, 유능한, 적격인\n" +
			"\n" +
			"\n" +
			"\n" +
			"reasonable\n" +
			"타당한, 합당한\n" +
			"\n" +
			"\n" +
			"\n" +
			"responsive\n" +
			"신속히 대응하는\n" +
			"\n" +
			"\n" +
			"\n" +
			"responsible\n" +
			"책임이 있는\n" +
			"\n" +
			"\n" +
			"\n" +
			"receive\n" +
			"받다\n" +
			"\n" +
			"\n" +
			"\n" +
			"transfer\n" +
			"옮기다\n" +
			"\n" +
			"\n" +
			"\n" +
			"conduct\n" +
			"실시하다, 행동\n" +
			"\n" +
			"\n" +
			"\n" +
			"qualification\n" +
			"자격\n" +
			"\n" +
			"\n" +
			"\n" +
			"recently\n" +
			"최근에\n" +
			"\n" +
			"\n" +
			"\n" +
			"hire\n" +
			"고용하다, 빌리다\n" +
			"\n" +
			"\n" +
			"\n" +
			"supply\n" +
			"공급, 공급하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"subscriber\n" +
			"구독자\n" +
			"\n" +
			"\n" +
			"\n" +
			"subscribtion\n" +
			"구독\n" +
			"\n" +
			"\n" +
			"\n" +
			"train\n" +
			"교육시키다\n" +
			"\n" +
			"\n" +
			"\n" +
			"look for\n" +
			"~를 찾다\n" +
			"\n" +
			"\n" +
			"\n" +
			"responsible for\n" +
			"~에 책임이 있는\n" +
			"\n" +
			"\n" +
			"\n" +
			"manager\n" +
			"경영자, 매니저\n" +
			"\n" +
			"\n" +
			"\n" +
			"renovation\n" +
			"개조\n" +
			"\n" +
			"\n" +
			"\n" +
			"renovate\n" +
			"개조하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"banquet\n" +
			"연회\n" +
			"\n" +
			"\n" +
			"\n" +
			"banquet facility\n" +
			"연회장\n" +
			"\n" +
			"\n" +
			"\n" +
			"facility\n" +
			"시설, 기능\n" +
			"\n" +
			"\n" +
			"\n" +
			"pavement\n" +
			"인도, 보도\n" +
			"\n" +
			"\n" +
			"\n" +
			"aim to v\n" +
			"~를 목표로 하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"educate\n" +
			"교육하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"attach\n" +
			"첨부하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"participate\n" +
			"참가하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"effective\n" +
			"효과적인, ~부터\n" +
			"\n" +
			"\n" +
			"\n" +
			"effectively\n" +
			"효과적으로\n" +
			"\n" +
			"\n" +
			"\n" +
			"celebrate\n" +
			"기념하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"celebration\n" +
			"기념 행사, 기념\n" +
			"\n" +
			"\n" +
			"\n" +
			"foundation\n" +
			"토대, 재단, 설립\n" +
			"\n" +
			"\n" +
			"\n" +
			"purse\n" +
			"지갑\n" +
			"\n" +
			"\n" +
			"\n" +
			"supervise\n" +
			"감독하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"inform\n" +
			"알리다\n" +
			"\n" +
			"\n" +
			"\n" +
			"transport\n" +
			"수송, 수송하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"response\n" +
			"대답, 반응\n" +
			"\n" +
			"\n" +
			"\n" +
			"propose\n" +
			"제안하다, 청혼하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"mutual\n" +
			"상호간의, 공동의\n" +
			"\n" +
			"\n" +
			"\n" +
			"completion\n" +
			"완료\n" +
			"\n" +
			"\n" +
			"\n" +
			"personal\n" +
			"개인의, 개인적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"personnel\n" +
			"인원(직원들), 인사과\n" +
			"\n" +
			"\n" +
			"\n" +
			"whether\n" +
			"~인지 아닌지, ~이든 아니든\n" +
			"\n" +
			"\n" +
			"\n" +
			"expert\n" +
			"전문가\n" +
			"\n" +
			"\n" +
			"\n" +
			"earn\n" +
			"얻다, 벌다\n" +
			"\n" +
			"\n" +
			"\n" +
			"respond\n" +
			"반응하다, 응답하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"undersell\n" +
			"~보다 싸게 팔다\n" +
			"\n" +
			"\n" +
			"\n" +
			"outsell\n" +
			"~보다 많이 [빨리, 비싸게] 팔다\n" +
			"\n" +
			"\n" +
			"\n" +
			"put together\n" +
			"(모아서) 만들다; 작성하다; 조립하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"flash\n" +
			"깜빡이다\n" +
			"\n" +
			"\n" +
			"\n" +
			"rebate\n" +
			"환불해 주다\n" +
			"\n" +
			"\n" +
			"\n" +
			"pay off\n" +
			"성과가 나다, (빚을) 전액 갚다\n" +
			"\n" +
			"\n" +
			"\n" +
			"disagree\n" +
			"의견을 달리하다, 일치하지 않다\n" +
			"\n" +
			"\n" +
			"\n" +
			"single out\n" +
			"선발하다, 발탁하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"vaccinate\n" +
			"예방 접종하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"treat\n" +
			"치료하다, 처치하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"illustrate\n" +
			"삽화를 쓰다\n" +
			"\n" +
			"\n" +
			"\n" +
			"sign up\n" +
			"등록하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"stream\n" +
			"연속적으로 전송하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"recite\n" +
			"낭송하다, 암송하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"turn around\n" +
			"호전되다, 호전시키다\n" +
			"\n" +
			"\n" +
			"\n" +
			"downsize\n" +
			"줄이다. 구조조정하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"depict\n" +
			"묘사하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"turn to\n" +
			"~에게 의지하다, ~을 참조하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"telecommute\n" +
			"재택 근무하다 (= work from home)\n" +
			"\n" +
			"\n" +
			"\n" +
			"transform\n" +
			"변형시키다\n" +
			"\n" +
			"\n" +
			"\n" +
			"dispatch\n" +
			"발송하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"commend\n" +
			"칭찬하다; 기리다\n" +
			"\n" +
			"\n" +
			"\n" +
			"compensate\n" +
			"보상하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"undercharge\n" +
			"과소 청구하다, (요금 등을) 덜 받다\n" +
			"\n" +
			"\n" +
			"\n" +
			"constitute\n" +
			"구성하다; ~와 다름없다\n" +
			"\n" +
			"\n" +
			"\n" +
			"allot\n" +
			"할당하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"inaugurate\n" +
			"개시하다, 취임시키다\n" +
			"\n" +
			"\n" +
			"\n" +
			"incorporate\n" +
			"통합하다, 포함하다, 편입하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"embark on[upon]\n" +
			"(사업 등에) 착수하다, 시작하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"induce\n" +
			"유발하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"cease\n" +
			"그치다, 그만두다, 중지하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"refurbish\n" +
			"재단장하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"stipulate\n" +
			"명시하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"rectify\n" +
			"바로잡다, 해결하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"rave\n" +
			"격찬하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"empower\n" +
			"권한을 부여하다, 권력을 위임하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"intrigue\n" +
			"흥미를 돋우다\n" +
			"\n" +
			"\n" +
			"\n" +
			"allure\n" +
			"꾀다, 유혹하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"attest\n" +
			"증명하다, 입증하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"liquidate\n" +
			"청산하다, 정리하다, 현금화하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"aid\n" +
			"지원, 원조\n" +
			"\n" +
			"\n" +
			"\n" +
			"disapproval\n" +
			"반대\n" +
			"\n" +
			"\n" +
			"\n" +
			"graduation\n" +
			"졸업\n" +
			"\n" +
			"\n" +
			"\n" +
			"auction\n" +
			"경매\n" +
			"\n" +
			"\n" +
			"\n" +
			"checkup\n" +
			"점검, 검사\n" +
			"\n" +
			"\n" +
			"\n" +
			"guidelines\n" +
			"지침\n" +
			"\n" +
			"\n" +
			"\n" +
			"behavior\n" +
			"행위, 행동\n" +
			"\n" +
			"\n" +
			"\n" +
			"contents\n" +
			"내용물\n" +
			"\n" +
			"\n" +
			"\n" +
			"society\n" +
			"사회, 협회\n" +
			"\n" +
			"\n" +
			"\n" +
			"invention\n" +
			"발명(품)\n" +
			"\n" +
			"\n" +
			"\n" +
			"government\n" +
			"정부\n" +
			"\n" +
			"\n" +
			"\n" +
			"principle\n" +
			"원리, 원칙, 주의\n" +
			"\n" +
			"\n" +
			"\n" +
			"factor\n" +
			"요소, 요인\n" +
			"\n" +
			"\n" +
			"\n" +
			"loss\n" +
			"손실(물), 손해\n" +
			"\n" +
			"\n" +
			"\n" +
			"decade\n" +
			"10년\n" +
			"\n" +
			"\n" +
			"\n" +
			"profession\n" +
			"직업\n" +
			"\n" +
			"\n" +
			"\n" +
			"abuse\n" +
			"남용\n" +
			"\n" +
			"\n" +
			"\n" +
			"lawsuit\n" +
			"소송, 고소\n" +
			"\n" +
			"\n" +
			"\n" +
			"mission\n" +
			"임무, 사명\n" +
			"\n" +
			"\n" +
			"\n" +
			"public holiday\n" +
			"공휴일\n" +
			"\n" +
			"\n" +
			"\n" +
			"administrator\n" +
			"행정관, 사무관\n" +
			"\n" +
			"\n" +
			"\n" +
			"diploma\n" +
			"졸업장, 학위증서\n" +
			"\n" +
			"\n" +
			"\n" +
			"prerequisite\n" +
			"필수 조건, 전제 조건\n" +
			"\n" +
			"\n" +
			"\n" +
			"aptitude\n" +
			"적성, 소질\n" +
			"\n" +
			"\n" +
			"\n" +
			"oversight\n" +
			"실수, 부주의, 간과\n" +
			"\n" +
			"\n" +
			"\n" +
			"distraction\n" +
			"방해물\n" +
			"\n" +
			"\n" +
			"\n" +
			"command\n" +
			"명령, 지휘: (언어의) 구사 능력\n" +
			"\n" +
			"\n" +
			"\n" +
			"strife\n" +
			"갈등, 불화\n" +
			"\n" +
			"\n" +
			"\n" +
			"infringement\n" +
			"침해\n" +
			"\n" +
			"\n" +
			"\n" +
			"gross income\n" +
			"총소득, 총수입\n" +
			"\n" +
			"\n" +
			"\n" +
			"deviation\n" +
			"벗어남, 탈선\n" +
			"\n" +
			"\n" +
			"\n" +
			"increment\n" +
			"증가, 증대\n" +
			"\n" +
			"\n" +
			"\n" +
			"replica\n" +
			"복제품\n" +
			"\n" +
			"\n" +
			"\n" +
			"proponent\n" +
			"지지자, 옹호자\n" +
			"\n" +
			"\n" +
			"\n" +
			"declaration\n" +
			"선언, 발표\n" +
			"\n" +
			"\n" +
			"\n" +
			"depiction\n" +
			"묘사, 서술\n" +
			"\n" +
			"\n" +
			"\n" +
			"ballot\n" +
			"투표 용지, 투표권, 비밀 투표\n" +
			"\n" +
			"\n" +
			"\n" +
			"accordance\n" +
			"일치, 조화\n" +
			"\n" +
			"\n" +
			"\n" +
			"ridership\n" +
			"(대중교통) 이용자 (수); 승차율\n" +
			"\n" +
			"\n" +
			"\n" +
			"ambiance\n" +
			"환경, 분위기\n" +
			"\n" +
			"\n" +
			"\n" +
			"discrepancy\n" +
			"불일치\n" +
			"\n" +
			"\n" +
			"\n" +
			"aspiration\n" +
			"열망, 포부\n" +
			"\n" +
			"\n" +
			"\n" +
			"labor dispute\n" +
			"노동쟁의\n" +
			"\n" +
			"\n" +
			"\n" +
			"prefer\n" +
			"선호하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"technique\n" +
			"기술, 기법\n" +
			"\n" +
			"\n" +
			"\n" +
			"digit\n" +
			"숫자\n" +
			"\n" +
			"\n" +
			"\n" +
			"sector\n" +
			"부문, 구역\n" +
			"\n" +
			"\n" +
			"\n" +
			"trade\n" +
			"무역\n" +
			"\n" +
			"\n" +
			"\n" +
			"scholar\n" +
			"학자\n" +
			"\n" +
			"\n" +
			"\n" +
			"mechanic\n" +
			"수리공, 정비사\n" +
			"\n" +
			"\n" +
			"\n" +
			"liquid\n" +
			"액체\n" +
			"\n" +
			"\n" +
			"\n" +
			"merit\n" +
			"장점\n" +
			"\n" +
			"\n" +
			"\n" +
			"boardroom\n" +
			"회의실\n" +
			"\n" +
			"\n" +
			"\n" +
			"passion\n" +
			"열정\n" +
			"\n" +
			"\n" +
			"\n" +
			"time-off\n" +
			"결근, 휴식\n" +
			"\n" +
			"\n" +
			"\n" +
			"disaster\n" +
			"재난, 재해\n" +
			"\n" +
			"\n" +
			"\n" +
			"merchant\n" +
			"상인\n" +
			"\n" +
			"\n" +
			"\n" +
			"experiment\n" +
			"실험, 실험하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"electronics\n" +
			"전자 공학, 전자 제품\n" +
			"\n" +
			"\n" +
			"\n" +
			"iron\n" +
			"다리미, 철\n" +
			"\n" +
			"\n" +
			"\n" +
			"range\n" +
			"범위, 다양성\n" +
			"\n" +
			"\n" +
			"\n" +
			"statistics\n" +
			"통계학\n" +
			"\n" +
			"\n" +
			"\n" +
			"fever\n" +
			"열\n" +
			"\n" +
			"\n" +
			"\n" +
			"shareholder\n" +
			"주주\n" +
			"\n" +
			"\n" +
			"\n" +
			"transition\n" +
			"변화, 이행, 추이\n" +
			"\n" +
			"\n" +
			"\n" +
			"edge\n" +
			"가장자리, 유리함\n" +
			"\n" +
			"\n" +
			"\n" +
			"contestant\n" +
			"출전자, 경쟁자\n" +
			"\n" +
			"\n" +
			"\n" +
			"inclination\n" +
			"경향, 성향\n" +
			"\n" +
			"\n" +
			"\n" +
			"momentum\n" +
			"탄력, 추진력\n" +
			"\n" +
			"\n" +
			"\n" +
			"infusion\n" +
			"주입, 혼합물\n" +
			"\n" +
			"\n" +
			"\n" +
			"memorial\n" +
			"기념물, 기념관\n" +
			"\n" +
			"\n" +
			"\n" +
			"procurement\n" +
			"획득, 입수, 조달\n" +
			"\n" +
			"\n" +
			"\n" +
			"concierge\n" +
			"안내인, 관리인, 수위\n" +
			"\n" +
			"\n" +
			"\n" +
			"jeopardy\n" +
			"위험\n" +
			"\n" +
			"\n" +
			"\n" +
			"collateral\n" +
			"담보물\n" +
			"\n" +
			"\n" +
			"\n" +
			"conjunction\n" +
			"연합, 공동\n" +
			"\n" +
			"\n" +
			"\n" +
			"flair\n" +
			"재능, 솜씨\n" +
			"\n" +
			"\n" +
			"\n" +
			"bookkeeper\n" +
			"회계 장부 담당자\n" +
			"\n" +
			"\n" +
			"\n" +
			"persistence\n" +
			"지속, 고집\n" +
			"\n" +
			"\n" +
			"\n" +
			"detector\n" +
			"발견자, 탐지기\n" +
			"\n" +
			"\n" +
			"\n" +
			"concession\n" +
			"양보, 인정\n" +
			"\n" +
			"\n" +
			"\n" +
			"halt\n" +
			"중단, 멈춤\n" +
			"\n" +
			"\n" +
			"\n" +
			"reproduction\n" +
			"재생, 복제(품)\n" +
			"\n" +
			"\n" +
			"\n" +
			"excavation\n" +
			"발굴, 발굴지\n" +
			"\n" +
			"\n" +
			"\n" +
			"citation\n" +
			"인용(구), 표창(장)\n" +
			"\n" +
			"\n" +
			"\n" +
			"strike\n" +
			"파업\n" +
			"\n" +
			"\n" +
			"\n" +
			"bargain\n" +
			"싼 물건, 좋은 조건의 거래\n" +
			"\n" +
			"\n" +
			"\n" +
			"outerwear\n" +
			"겉옷, 외투\n" +
			"\n" +
			"\n" +
			"\n" +
			"handbook\n" +
			"안내서, 참고서\n" +
			"\n" +
			"\n" +
			"\n" +
			"difference\n" +
			"차이, 차액\n" +
			"\n" +
			"\n" +
			"\n" +
			"interviewer\n" +
			"면접관\n" +
			"\n" +
			"\n" +
			"\n" +
			"ownership\n" +
			"소유(권)\n" +
			"\n" +
			"\n" +
			"\n" +
			"disease\n" +
			"질병\n" +
			"\n" +
			"\n" +
			"\n" +
			"remedy\n" +
			"치료(법)\n" +
			"\n" +
			"\n" +
			"\n" +
			"healthcare\n" +
			"건강 관리, 보건 의료\n" +
			"\n" +
			"\n" +
			"\n" +
			"tutorial\n" +
			"교육 자료, 개별 지도\n" +
			"\n" +
			"\n" +
			"\n" +
			"base\n" +
			"기반, 토대\n" +
			"\n" +
			"\n" +
			"\n" +
			"kickoff\n" +
			"시작, 개시\n" +
			"\n" +
			"\n" +
			"\n" +
			"discovery\n" +
			"발견\n" +
			"\n" +
			"\n" +
			"\n" +
			"finalist\n" +
			"결승 진출자\n" +
			"\n" +
			"\n" +
			"\n" +
			"firm\n" +
			"회사\n" +
			"\n" +
			"\n" +
			"\n" +
			"patron\n" +
			"고객, 이용자\n" +
			"\n" +
			"\n" +
			"\n" +
			"earnings\n" +
			"수익\n" +
			"\n" +
			"\n" +
			"\n" +
			"obstacle\n" +
			"장애물\n" +
			"\n" +
			"\n" +
			"\n" +
			"surcharge\n" +
			"추가 요금\n" +
			"\n" +
			"\n" +
			"\n" +
			"dismissal\n" +
			"해고\n" +
			"\n" +
			"\n" +
			"\n" +
			"conglomerate\n" +
			"대기업, (거대) 복합 기업\n" +
			"\n" +
			"\n" +
			"\n" +
			"logistics\n" +
			"물류 사업의, 세부 계획\n" +
			"\n" +
			"\n" +
			"\n" +
			"complication\n" +
			"합병증, (복잡하게 만드는) 문제\n" +
			"\n" +
			"\n" +
			"\n" +
			"prevention\n" +
			"예방\n" +
			"\n" +
			"\n" +
			"\n" +
			"veterinarian\n" +
			"수의사\n" +
			"\n" +
			"\n" +
			"\n" +
			"circumstance\n" +
			"상황, 환경\n" +
			"\n" +
			"\n" +
			"\n" +
			"proceeding\n" +
			"회의록\n" +
			"\n" +
			"\n" +
			"\n" +
			"breakthrough\n" +
			"획기적 발전, 돌파구\n" +
			"\n" +
			"\n" +
			"\n" +
			"inception\n" +
			"시작, 개시, 발단\n" +
			"\n" +
			"\n" +
			"\n" +
			"milestone\n" +
			"획기적 사건\n" +
			"\n" +
			"\n" +
			"\n" +
			"proliferation\n" +
			"확산\n" +
			"\n" +
			"\n" +
			"\n" +
			"compilation\n" +
			"편집, 편찬(물)\n" +
			"\n" +
			"\n" +
			"\n" +
			"circulation\n" +
			"순환, 유통, 판매 부수\n" +
			"\n" +
			"\n" +
			"\n" +
			"upswing\n" +
			"호전, 상승\n" +
			"\n" +
			"\n" +
			"\n" +
			"hypothesis\n" +
			"가설\n" +
			"\n" +
			"\n" +
			"\n" +
			"legislation\n" +
			"법률, 법안\n" +
			"\n" +
			"\n" +
			"\n" +
			"identical\n" +
			"똑같은, 동일한\n" +
			"\n" +
			"\n" +
			"\n" +
			"steep\n" +
			"가파른, 급격한\n" +
			"\n" +
			"\n" +
			"\n" +
			"vacant\n" +
			"공석의, 비어 있는\n" +
			"\n" +
			"\n" +
			"\n" +
			"useful\n" +
			"유용한\n" +
			"\n" +
			"\n" +
			"\n" +
			"respected\n" +
			"훌륭한, 평판 있는\n" +
			"\n" +
			"\n" +
			"\n" +
			"lively\n" +
			"활기찬, 활발한\n" +
			"\n" +
			"\n" +
			"\n" +
			"vague\n" +
			"애매한\n" +
			"\n" +
			"\n" +
			"\n" +
			"harmful\n" +
			"해로운, 유해한\n" +
			"\n" +
			"\n" +
			"\n" +
			"curious\n" +
			"궁금한, 호기심이 많은\n" +
			"\n" +
			"\n" +
			"\n" +
			"dissatisfied\n" +
			"불만스러운\n" +
			"\n" +
			"\n" +
			"\n" +
			"external\n" +
			"외부의\n" +
			"\n" +
			"\n" +
			"\n" +
			"wasteful\n" +
			"낭비의, 헛된\n" +
			"\n" +
			"\n" +
			"\n" +
			"realistic\n" +
			"현실적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"passionate\n" +
			"열정적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"lengthy\n" +
			"장황한, 너무 긴\n" +
			"\n" +
			"\n" +
			"\n" +
			"sudden\n" +
			"갑작스러운\n" +
			"\n" +
			"\n" +
			"\n" +
			"doubtful\n" +
			"의심스러운, 확신이 없는\n" +
			"\n" +
			"\n" +
			"\n" +
			"international\n" +
			"국제적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"entry-level\n" +
			"입문의, 초보자용의\n" +
			"\n" +
			"\n" +
			"\n" +
			"recreational\n" +
			"오락의, 레크리에이션의\n" +
			"\n" +
			"\n" +
			"\n" +
			"patient\n" +
			"환자, 인내하는\n" +
			"\n" +
			"\n" +
			"\n" +
			"bilateral\n" +
			"양자의, 쌍방의\n" +
			"\n" +
			"\n" +
			"\n" +
			"probationary\n" +
			"견습 기간 중인\n" +
			"\n" +
			"\n" +
			"\n" +
			"elaborate\n" +
			"정교한\n" +
			"\n" +
			"\n" +
			"\n" +
			"eventful\n" +
			"다사다난한\n" +
			"\n" +
			"\n" +
			"\n" +
			"intermittent\n" +
			"간헐적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"enlightening\n" +
			"계몽적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"tedious\n" +
			"지루한, 싫증나는\n" +
			"\n" +
			"\n" +
			"\n" +
			"thrifty\n" +
			"검소한, 절약하는\n" +
			"\n" +
			"\n" +
			"\n" +
			"coherent\n" +
			"일관성 있는\n" +
			"\n" +
			"\n" +
			"\n" +
			"robust\n" +
			"튼튼한, 강건한, 확고한\n" +
			"\n" +
			"\n" +
			"\n" +
			"reciprocal\n" +
			"상호간의, 서로의\n" +
			"\n" +
			"\n" +
			"\n" +
			"conventional\n" +
			"전통적인, 관습적인, 형식적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"argumentative\n" +
			"논쟁적인, 토론하기를 좋아하는\n" +
			"\n" +
			"\n" +
			"\n" +
			"tolerant\n" +
			"관대한, 인내하는\n" +
			"\n" +
			"\n" +
			"\n" +
			"utmost\n" +
			"최대한의, 극도의\n" +
			"\n" +
			"\n" +
			"\n" +
			"harsh\n" +
			"거친, 가혹한\n" +
			"\n" +
			"\n" +
			"\n" +
			"reversible\n" +
			"뒤집을 수 있는\n" +
			"\n" +
			"\n" +
			"\n" +
			"irreversible\n" +
			"되돌릴 수 없는\n" +
			"\n" +
			"\n" +
			"\n" +
			"concentrated\n" +
			"집중적인, 농축된\n" +
			"\n" +
			"\n" +
			"\n" +
			"fundamental\n" +
			"기본적인, 필수의\n" +
			"\n" +
			"\n" +
			"\n" +
			"incidental\n" +
			"부수적인, 부수적인 것\n" +
			"\n" +
			"\n" +
			"\n" +
			"gradual\n" +
			"점진적인, 단계적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"proposed\n" +
			"제안된\n" +
			"\n" +
			"\n" +
			"\n" +
			"earliest\n" +
			"(~가 가능한) 가장 빠른 때\n" +
			"\n" +
			"\n" +
			"\n" +
			"publisher\n" +
			"출판인, 출판사\n" +
			"\n" +
			"\n" +
			"\n" +
			"human resource\n" +
			"인력\n" +
			"\n" +
			"\n" +
			"\n" +
			"encourage\n" +
			"권장하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"take a survey\n" +
			"설문 조사에 참여하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"spent\n" +
			"이미 쓴\n" +
			"\n" +
			"\n" +
			"\n" +
			"half\n" +
			"절반\n" +
			"\n" +
			"\n" +
			"\n" +
			"budget\n" +
			"예산\n" +
			"\n" +
			"\n" +
			"\n" +
			"critic\n" +
			"비평가, 평론가\n" +
			"\n" +
			"\n" +
			"\n" +
			"thought-provoking\n" +
			"시사하는 바가 많은\n" +
			"\n" +
			"\n" +
			"\n" +
			"novel\n" +
			"소설\n" +
			"\n" +
			"\n" +
			"\n" +
			"take place\n" +
			"일어나다, 개최되다\n" +
			"\n" +
			"\n" +
			"\n" +
			"those who\n" +
			"~하는 사람들\n" +
			"\n" +
			"\n" +
			"\n" +
			"training session\n" +
			"연수\n" +
			"\n" +
			"\n" +
			"\n" +
			"merger\n" +
			"합병\n" +
			"\n" +
			"\n" +
			"\n" +
			"untrue\n" +
			"사실이 아닌, 허위의\n" +
			"\n" +
			"\n" +
			"\n" +
			"sales people\n" +
			"판매원\n" +
			"\n" +
			"\n" +
			"\n" +
			"introduction\n" +
			"도입, 소개\n" +
			"\n" +
			"\n" +
			"\n" +
			"pursue\n" +
			"추구하다, 계속하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"career\n" +
			"직업, 사회생활\n" +
			"\n" +
			"\n" +
			"\n" +
			"qualifier\n" +
			"예선 통과자, 예선전\n" +
			"\n" +
			"\n" +
			"\n" +
			"decline\n" +
			"감소, 감소하다, 거절하다, 사양하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"trace\n" +
			"추적하다, 흔적\n" +
			"\n" +
			"\n" +
			"\n" +
			"restoration\n" +
			"복원\n" +
			"\n" +
			"\n" +
			"\n" +
			"sincerely\n" +
			"진심으로\n" +
			"\n" +
			"\n" +
			"\n" +
			"sincere\n" +
			"진실된, 진정한\n" +
			"\n" +
			"\n" +
			"\n" +
			"assistance\n" +
			"지원, 도움\n" +
			"\n" +
			"\n" +
			"\n" +
			"take less\n" +
			"더 적게\n" +
			"\n" +
			"\n" +
			"\n" +
			"fifteen\n" +
			"15\n" +
			"\n" +
			"\n" +
			"\n" +
			"complain\n" +
			"불평하다, 항의하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"appreciate\n" +
			"인정하다, 고마워하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"appreciation\n" +
			"감탄, 공감, 감사\n" +
			"\n" +
			"\n" +
			"\n" +
			"finances\n" +
			"돈, 금전\n" +
			"\n" +
			"\n" +
			"\n" +
			"complete\n" +
			"완료하다, 완벽한\n" +
			"\n" +
			"\n" +
			"\n" +
			"remain\n" +
			"(~인 상태로) 남아있다\n" +
			"\n" +
			"\n" +
			"\n" +
			"least\n" +
			"최소, 최소로\n" +
			"\n" +
			"\n" +
			"\n" +
			"professionally\n" +
			"전문적으로\n" +
			"\n" +
			"\n" +
			"\n" +
			"beginner\n" +
			"초보자, 초심자\n" +
			"\n" +
			"\n" +
			"\n" +
			"begin\n" +
			"시작하다, 시작되다\n" +
			"\n" +
			"\n" +
			"\n" +
			"significance\n" +
			"중요성\n" +
			"\n" +
			"\n" +
			"\n" +
			"charity\n" +
			"자선단체\n" +
			"\n" +
			"\n" +
			"\n" +
			"attempt\n" +
			"시도, 시도하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"attraction\n" +
			"매력, 명소\n" +
			"\n" +
			"\n" +
			"\n" +
			"refundable\n" +
			"환불가능한\n" +
			"\n" +
			"\n" +
			"\n" +
			"fully\n" +
			"완전히, 충분히\n" +
			"\n" +
			"\n" +
			"\n" +
			"unfortunately\n" +
			"불행히도, 유갑스럽게도\n" +
			"\n" +
			"\n" +
			"\n" +
			"currently\n" +
			"현재, 지금\n" +
			"\n" +
			"\n" +
			"\n" +
			"thorough\n" +
			"빈틈없는, 철저한\n" +
			"\n" +
			"\n" +
			"\n" +
			"throughly\n" +
			"완전히, 철저히\n" +
			"\n" +
			"\n" +
			"\n" +
			"ship\n" +
			"배, 수송하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"separation\n" +
			"분리, 헤어짐\n" +
			"\n" +
			"\n" +
			"\n" +
			"separately\n" +
			"따로, 별도로\n" +
			"\n" +
			"\n" +
			"\n" +
			"finally\n" +
			"마침내\n" +
			"\n" +
			"\n" +
			"\n" +
			"directly\n" +
			"직접, 곧바로\n" +
			"\n" +
			"\n" +
			"\n" +
			"recently\n" +
			"최근에\n" +
			"\n" +
			"\n" +
			"\n" +
			"recent\n" +
			"최근의\n" +
			"\n" +
			"\n" +
			"\n" +
			"already\n" +
			"이미\n" +
			"\n" +
			"\n" +
			"\n" +
			"yet\n" +
			"아직 (부정문)\n" +
			"\n" +
			"\n" +
			"\n" +
			"always\n" +
			"항상\n" +
			"\n" +
			"\n" +
			"\n" +
			"often\n" +
			"자주\n" +
			"\n" +
			"\n" +
			"\n" +
			"once\n" +
			"(부사) 한 번, (접속사) ~하자마자, ~할 때\n" +
			"\n" +
			"\n" +
			"\n" +
			"aboud\n" +
			"대략\n" +
			"\n" +
			"\n" +
			"\n" +
			"extremely\n" +
			"극도로\n" +
			"\n" +
			"\n" +
			"\n" +
			"even\n" +
			"심지어\n" +
			"\n" +
			"\n" +
			"\n" +
			"just\n" +
			"오직\n" +
			"\n" +
			"\n" +
			"\n" +
			"only\n" +
			"오직\n" +
			"\n" +
			"\n" +
			"\n" +
			"simply\n" +
			"간단히\n" +
			"\n" +
			"\n" +
			"\n" +
			"almost\n" +
			"거의\n" +
			"\n" +
			"\n" +
			"\n" +
			"lecture\n" +
			"강의, 강의하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"last\n" +
			"지속되다\n" +
			"\n" +
			"\n" +
			"\n" +
			"shortly\n" +
			"곧\n" +
			"\n" +
			"\n" +
			"\n" +
			"nearly\n" +
			"거의\n" +
			"\n" +
			"\n" +
			"\n" +
			"closely\n" +
			"긴밀히, 면밀히\n" +
			"\n" +
			"\n" +
			"\n" +
			"century\n" +
			"100년, 세기\n" +
			"\n" +
			"\n" +
			"\n" +
			"monitor\n" +
			"모니터, 추적 관찰하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"prove\n" +
			"입증하다, 증명하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"previous\n" +
			"이전의, 바로 앞의\n" +
			"\n" +
			"\n" +
			"\n" +
			"employer\n" +
			"고용주\n" +
			"\n" +
			"\n" +
			"\n" +
			"individual\n" +
			"개인, 개인의\n" +
			"\n" +
			"\n" +
			"\n" +
			"strict\n" +
			"엄격한\n" +
			"\n" +
			"\n" +
			"\n" +
			"accurate\n" +
			"정확한, 정밀한\n" +
			"\n" +
			"\n" +
			"\n" +
			"outstanding\n" +
			"뛰어난, 미해결된\n" +
			"\n" +
			"\n" +
			"\n" +
			"temporary\n" +
			"일시적인, 임시의\n" +
			"\n" +
			"\n" +
			"\n" +
			"dining\n" +
			"식사\n" +
			"\n" +
			"\n" +
			"\n" +
			"enjoyable\n" +
			"즐거운\n" +
			"\n" +
			"\n" +
			"\n" +
			"enjoyably\n" +
			"즐겁게\n" +
			"\n" +
			"\n" +
			"\n" +
			"leadership\n" +
			"대표직, 지도력\n" +
			"\n" +
			"\n" +
			"\n" +
			"eager\n" +
			"열심인, 열망하는\n" +
			"\n" +
			"\n" +
			"\n" +
			"eagerly\n" +
			"간절하게\n" +
			"\n" +
			"\n" +
			"\n" +
			"consistent\n" +
			"한결같은, 일관된\n" +
			"\n" +
			"\n" +
			"\n" +
			"consistently\n" +
			"일관하여, 지속적으로\n" +
			"\n" +
			"\n" +
			"\n" +
			"would\n" +
			"~일 것이다, will의 과거형\n" +
			"\n" +
			"\n" +
			"\n" +
			"a summary of\n" +
			"~의 요약본\n" +
			"\n" +
			"\n" +
			"\n" +
			"a maximum of\n" +
			"최대의\n" +
			"\n" +
			"\n" +
			"\n" +
			"a selection of\n" +
			"다양한\n" +
			"\n" +
			"\n" +
			"\n" +
			"a collection of\n" +
			"~의 모음집\n" +
			"\n" +
			"\n" +
			"\n" +
			"securely\n" +
			"안전히, 확실히\n" +
			"\n" +
			"\n" +
			"\n" +
			"secure\n" +
			"안전한, 확실한, 고정시키다\n" +
			"\n" +
			"\n" +
			"\n" +
			"casual\n" +
			"무심한, 건성의, 평상복, 비정규직\n" +
			"\n" +
			"\n" +
			"\n" +
			"among\n" +
			"~에 둘러싸인, ~중에\n" +
			"\n" +
			"\n" +
			"\n" +
			"particularize\n" +
			"자세히 다루다\n" +
			"\n" +
			"\n" +
			"\n" +
			"particularity\n" +
			"독특함, 꼼꼼함\n" +
			"\n" +
			"\n" +
			"\n" +
			"numerous\n" +
			"많은\n" +
			"\n" +
			"\n" +
			"\n" +
			"overtime\n" +
			"초과 근무(야근), 초과 근무 수당\n" +
			"\n" +
			"\n" +
			"\n" +
			"process\n" +
			"과정, 처리하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"near\n" +
			"가까운, 가까이 (형용사, 부사, 시간상으로, 거리상으로)\n" +
			"\n" +
			"\n" +
			"\n" +
			"loan\n" +
			"대출\n" +
			"\n" +
			"\n" +
			"\n" +
			"boast\n" +
			"자랑하다, 자랑\n" +
			"\n" +
			"\n" +
			"\n" +
			"either\n" +
			"어느 하나, 각각, ~도\n" +
			"\n" +
			"\n" +
			"\n" +
			"buyer\n" +
			"구매자\n" +
			"\n" +
			"\n" +
			"\n" +
			"first-time\n" +
			"처음으로 해보는\n" +
			"\n" +
			"\n" +
			"\n" +
			"rise\n" +
			"증가, 급여 인상, 올라가다, 일어나다\n" +
			"\n" +
			"\n" +
			"\n" +
			"steady\n" +
			"꾸준한, 변함없는, 균형을 잡다, 다시 안정되다\n" +
			"\n" +
			"\n" +
			"\n" +
			"steadily\n" +
			"꾸준히, 꾸준하게\n" +
			"\n" +
			"\n" +
			"\n" +
			"steadiness\n" +
			"착실함, 끈기\n" +
			"\n" +
			"\n" +
			"\n" +
			"luggage\n" +
			"짐\n" +
			"\n" +
			"\n" +
			"\n" +
			"subject\n" +
			"주제, 과목, ~될 수 있는\n" +
			"\n" +
			"\n" +
			"\n" +
			"accountable\n" +
			"책임이 있는\n" +
			"\n" +
			"\n" +
			"\n" +
			"transferable\n" +
			"이동 가능한, 양도 가능한\n" +
			"\n" +
			"\n" +
			"\n" +
			"charge\n" +
			"요금, 청구하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"rug\n" +
			"깔개, 무릎덮개\n" +
			"\n" +
			"\n" +
			"\n" +
			"almost\n" +
			"거의\n" +
			"\n" +
			"\n" +
			"\n" +
			"material\n" +
			"천, 재료, 물질적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"nearly\n" +
			"거의\n" +
			"\n" +
			"\n" +
			"\n" +
			"closed\n" +
			"닫힌, 폐쇄된\n" +
			"\n" +
			"\n" +
			"\n" +
			"enjoyable\n" +
			"즐거운, 유쾌한\n" +
			"\n" +
			"\n" +
			"\n" +
			"excited\n" +
			"들뜬, 흥분한\n" +
			"\n" +
			"\n" +
			"\n" +
			"short\n" +
			"짧은, 짧게\n" +
			"\n" +
			"\n" +
			"\n" +
			"enormous\n" +
			"거대한, 엄청난\n" +
			"\n" +
			"\n" +
			"\n" +
			"elementary\n" +
			"초급의, 입문의\n" +
			"\n" +
			"\n" +
			"\n" +
			"valued\n" +
			"소중한\n" +
			"\n" +
			"\n" +
			"\n" +
			"wooden\n" +
			"나무의, 나무로 만든\n" +
			"\n" +
			"\n" +
			"\n" +
			"modern\n" +
			"현대의\n" +
			"\n" +
			"\n" +
			"\n" +
			"different\n" +
			"다른\n" +
			"\n" +
			"\n" +
			"\n" +
			"stunning\n" +
			"굉장히 아름다운, 깜짝 놀랄\n" +
			"\n" +
			"\n" +
			"\n" +
			"daily\n" +
			"매일의, 일상적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"user-friendly\n" +
			"다루기 쉬운\n" +
			"\n" +
			"\n" +
			"\n" +
			"foreseeable\n" +
			"미리 알 수 있는\n" +
			"\n" +
			"\n" +
			"\n" +
			"latter\n" +
			"후반의\n" +
			"\n" +
			"\n" +
			"\n" +
			"imaginary\n" +
			"상상의, 가상의\n" +
			"\n" +
			"\n" +
			"\n" +
			"imaginative\n" +
			"상상력이 풍부한\n" +
			"\n" +
			"\n" +
			"\n" +
			"further\n" +
			"더 멀리에(거리, 과거, 미래), 추가의\n" +
			"\n" +
			"\n" +
			"\n" +
			"time-consuming\n" +
			"(많은) 시간이 걸리는\n" +
			"\n" +
			"\n" +
			"\n" +
			"obvious\n" +
			"명백한\n" +
			"\n" +
			"\n" +
			"\n" +
			"corporate\n" +
			"기업의\n" +
			"\n" +
			"\n" +
			"\n" +
			"dietary\n" +
			"음식물의, 규정식의, 규정식, 규정량\n" +
			"\n" +
			"\n" +
			"\n" +
			"neutral\n" +
			"중립적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"imminent\n" +
			"임박한\n" +
			"\n" +
			"\n" +
			"\n" +
			"mundane\n" +
			"평범한, 일상적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"custodial\n" +
			"보관의, 관리인의\n" +
			"\n" +
			"\n" +
			"\n" +
			"on-call\n" +
			"대기 중인\n" +
			"\n" +
			"\n" +
			"\n" +
			"unbiased\n" +
			"편견(선입견) 없는\n" +
			"\n" +
			"\n" +
			"\n" +
			"marginal\n" +
			"미미한, 중요하지 않은\n" +
			"\n" +
			"\n" +
			"\n" +
			"definitive\n" +
			"확정적인, 최고의\n" +
			"\n" +
			"\n" +
			"\n" +
			"shallow\n" +
			"얕은, 피상적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"solitary\n" +
			"혼자의, 유일한\n" +
			"\n" +
			"\n" +
			"\n" +
			"exhaustive\n" +
			"철저한\n" +
			"\n" +
			"\n" +
			"\n" +
			"sheer\n" +
			"순전한, 완전한\n" +
			"\n" +
			"\n" +
			"\n" +
			"clerical\n" +
			"사무직의\n" +
			"\n" +
			"\n" +
			"\n" +
			"pending\n" +
			"임박한, 미결인\n" +
			"\n" +
			"\n" +
			"\n" +
			"contemporary\n" +
			"현대의, 동시대의\n" +
			"\n" +
			"\n" +
			"\n" +
			"transparent\n" +
			"투명한\n" +
			"\n" +
			"\n" +
			"\n" +
			"nominal\n" +
			"명목상의, 이름뿐인\n" +
			"\n" +
			"\n" +
			"\n" +
			"rugged\n" +
			"울퉁불퉁한, 강인하게 생긴\n" +
			"\n" +
			"\n" +
			"\n" +
			"indigenous\n" +
			"토착의, 고유한\n" +
			"\n" +
			"\n" +
			"\n" +
			"high-profile\n" +
			"세간의 이목을 끄는\n" +
			"\n" +
			"\n" +
			"\n" +
			"succinct\n" +
			"간결한\n" +
			"\n" +
			"\n" +
			"\n" +
			"perpetual\n" +
			"끊임없는, 영원한\n" +
			"\n" +
			"\n" +
			"\n" +
			"premature\n" +
			"시기상조의, 너무 이른\n" +
			"\n" +
			"\n" +
			"\n" +
			"fortunate\n" +
			"운이 좋은\n" +
			"\n" +
			"\n" +
			"\n" +
			"intermediate\n" +
			"중급의\n" +
			"\n" +
			"\n" +
			"\n" +
			"conclusive\n" +
			"결정적인, 확실한\n" +
			"\n" +
			"\n" +
			"\n" +
			"surrounding\n" +
			"주위의, 주변의\n" +
			"\n" +
			"\n" +
			"\n" +
			"vivid\n" +
			"뚜렷한, 선명한\n" +
			"\n" +
			"\n" +
			"\n" +
			"welcome\n" +
			"환영하다, 환영받는, 반가운\n" +
			"\n" +
			"\n" +
			"\n" +
			"unforeseen\n" +
			"뜻밖의, 예측하지 못한\n" +
			"\n" +
			"\n" +
			"\n" +
			"undeniable\n" +
			"부인할 수 없는, 불가피한\n" +
			"\n" +
			"\n" +
			"\n" +
			"questionable\n" +
			"의심스러운, 미심쩍은\n" +
			"\n" +
			"\n" +
			"\n" +
			"numerical\n" +
			"수의, 숫자상의, 숫자로 나타낸\n" +
			"\n" +
			"\n" +
			"\n" +
			"commonplace\n" +
			"아주 흔한, 흔히 있는 일\n" +
			"\n" +
			"\n" +
			"\n" +
			"elderly\n" +
			"나이 든\n" +
			"\n" +
			"\n" +
			"\n" +
			"hearty\n" +
			"다정한, 원기 왕성한\n" +
			"\n" +
			"\n" +
			"\n" +
			"secondhand\n" +
			"중고의, 간접적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"disturbing\n" +
			"충격적인, 불안감을 주는, 방해하는\n" +
			"\n" +
			"\n" +
			"\n" +
			"anxious\n" +
			"걱정하는, 불안한\n" +
			"\n" +
			"\n" +
			"\n" +
			"immobile\n" +
			"움직이지 않는 (못하는)\n" +
			"\n" +
			"\n" +
			"\n" +
			"live\n" +
			"살아 있는, 생방송의\n" +
			"\n" +
			"\n" +
			"\n" +
			"ancient\n" +
			"고대의\n" +
			"\n" +
			"\n" +
			"\n" +
			"immense\n" +
			"거대한, 막대한\n" +
			"\n" +
			"\n" +
			"\n" +
			"hostile\n" +
			"적대적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"commendable\n" +
			"칭찬할 만한\n" +
			"\n" +
			"\n" +
			"\n" +
			"resilient\n" +
			"탄력 있는, 되돌아가는\n" +
			"\n" +
			"\n" +
			"\n" +
			"scarce\n" +
			"부족한, 불충분한\n" +
			"\n" +
			"\n" +
			"\n" +
			"sporadic\n" +
			"산발적으로 일어나는\n" +
			"\n" +
			"\n" +
			"\n" +
			"savvy\n" +
			"지식, 요령있는, 잘 아는\n" +
			"\n" +
			"\n" +
			"\n" +
			"palpable\n" +
			"감지할 수 있는, 뚜렷한\n" +
			"\n" +
			"\n" +
			"\n" +
			"bountiful\n" +
			"풍부한, 관대한\n" +
			"\n" +
			"\n" +
			"\n" +
			"unbeatable\n" +
			"무적의, 타의 추종을 불허하는\n" +
			"\n" +
			"\n" +
			"\n" +
			"rigid\n" +
			"엄격한, 견고한\n" +
			"\n" +
			"\n" +
			"\n" +
			"steadfast\n" +
			"확고한, 불변의\n" +
			"\n" +
			"\n" +
			"\n" +
			"candid\n" +
			"솔직한\n" +
			"\n" +
			"\n" +
			"\n" +
			"mounting\n" +
			"증가하는\n" +
			"\n" +
			"\n" +
			"\n" +
			"neglectful\n" +
			"부주의한, 태만한\n" +
			"\n" +
			"\n" +
			"\n" +
			"bewildering\n" +
			"어리둥절하게[갈피를 못 잡게] 만드는\n" +
			"\n" +
			"\n" +
			"\n" +
			"complacent\n" +
			"자기 만족적인, 현실에 안주하는\n" +
			"\n" +
			"\n" +
			"\n" +
			"attainable\n" +
			"달성할 수 있는; 획득할 수 있는\n" +
			"\n" +
			"\n" +
			"\n" +
			"wary\n" +
			"주의 깊은, 신중한\n" +
			"\n" +
			"\n" +
			"\n" +
			"subtle\n" +
			"미묘한, 영리한, 절묘한\n" +
			"\n" +
			"\n" +
			"\n" +
			"lingering\n" +
			"오래가는\n" +
			"\n" +
			"\n" +
			"\n" +
			"edible\n" +
			"먹을 수 있는\n" +
			"\n" +
			"\n" +
			"\n" +
			"vast\n" +
			"방대한, 막대한\n" +
			"\n" +
			"\n" +
			"\n" +
			"faithful\n" +
			"충실한, 신의 있는\n" +
			"\n" +
			"\n" +
			"\n" +
			"former\n" +
			"예전의, 전자의\n" +
			"\n" +
			"\n" +
			"\n" +
			"unknown\n" +
			"알려지지 않은, 무명의\n" +
			"\n" +
			"\n" +
			"\n" +
			"entire\n" +
			"전체의\n" +
			"\n" +
			"\n" +
			"\n" +
			"prompt\n" +
			"즉각적인, 신속한\n" +
			"\n" +
			"\n" +
			"\n" +
			"energetic\n" +
			"힘이 넘치는, 원기 왕성한\n" +
			"\n" +
			"\n" +
			"\n" +
			"well-suited\n" +
			"적절한, 잘 어울리는\n" +
			"\n" +
			"\n" +
			"\n" +
			"industrious\n" +
			"근면한\n" +
			"\n" +
			"\n" +
			"\n" +
			"trustworthy\n" +
			"믿을 수 있는\n" +
			"\n" +
			"\n" +
			"\n" +
			"flawless\n" +
			"결점이 없는\n" +
			"\n" +
			"\n" +
			"\n" +
			"influential\n" +
			"영향력 있는\n" +
			"\n" +
			"\n" +
			"\n" +
			"reusable\n" +
			"재사용할 수 있는\n" +
			"\n" +
			"\n" +
			"\n" +
			"amusing\n" +
			"즐거운, 재미있는\n" +
			"\n" +
			"\n" +
			"\n" +
			"safe\n" +
			"안전한\n" +
			"\n" +
			"\n" +
			"\n" +
			"typical\n" +
			"전형적인, 대표적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"official\n" +
			"공식적인, 공인된\n" +
			"\n" +
			"\n" +
			"\n" +
			"specific\n" +
			"구체적인, 특정한\n" +
			"\n" +
			"\n" +
			"\n" +
			"polite\n" +
			"예의 바른\n" +
			"\n" +
			"\n" +
			"\n" +
			"respected\n" +
			"존경 받는, 평판 높은\n" +
			"\n" +
			"\n" +
			"\n" +
			"factual\n" +
			"사실에 기반을 둔\n" +
			"\n" +
			"\n" +
			"\n" +
			"insightful\n" +
			"통찰력 있는, 영감 있는\n" +
			"\n" +
			"\n" +
			"\n" +
			"restful\n" +
			"평안을 주는, 평온한\n" +
			"\n" +
			"\n" +
			"\n" +
			"tender\n" +
			"부드러운\n" +
			"\n" +
			"\n" +
			"\n" +
			"eventual\n" +
			"궁극적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"assertive\n" +
			"적극적인, 확신에 찬\n" +
			"\n" +
			"\n" +
			"\n" +
			"exaggerated\n" +
			"과장된, 과대한\n" +
			"\n" +
			"\n" +
			"\n" +
			"dominant\n" +
			"지배적인, 우세한\n" +
			"\n" +
			"\n" +
			"\n" +
			"lavish\n" +
			"풍성한, 호화로운\n" +
			"\n" +
			"\n" +
			"\n" +
			"genuine\n" +
			"진짜의, 진품의\n" +
			"\n" +
			"\n" +
			"\n" +
			"in-depth\n" +
			"심층적인, 깊이 있는\n" +
			"\n" +
			"\n" +
			"\n" +
			"instrumental\n" +
			"중요한, 악기에 의한\n" +
			"\n" +
			"\n" +
			"\n" +
			"distinctive\n" +
			"독특한\n" +
			"\n" +
			"\n" +
			"\n" +
			"unrivaled\n" +
			"경쟁자가 없는, 무적의\n" +
			"\n" +
			"\n" +
			"\n" +
			"excessive\n" +
			"과도한, 지나친\n" +
			"\n" +
			"\n" +
			"\n" +
			"dense\n" +
			"밀집한, 고밀도의\n" +
			"\n" +
			"\n" +
			"\n" +
			"inevitable\n" +
			"불가피한, 피할 수 없는\n" +
			"\n" +
			"\n" +
			"\n" +
			"succeeding\n" +
			"이어지는, 계속되는\n" +
			"\n" +
			"\n" +
			"\n" +
			"integral\n" +
			"필수적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"prominent\n" +
			"두드러진, 탁월한\n" +
			"\n" +
			"\n" +
			"\n" +
			"neatly\n" +
			"단정하게, 깔끔하게\n" +
			"\n" +
			"\n" +
			"\n" +
			"generally\n" +
			"일반적으로\n" +
			"\n" +
			"\n" +
			"\n" +
			"surely\n" +
			"확실히, 틀림없이\n" +
			"\n" +
			"\n" +
			"\n" +
			"fully\n" +
			"완전히, 충분히\n" +
			"\n" +
			"\n" +
			"\n" +
			"severely\n" +
			"심하게\n" +
			"\n" +
			"\n" +
			"\n" +
			"seriously\n" +
			"심각하게, 진지하게\n" +
			"\n" +
			"\n" +
			"\n" +
			"poorly\n" +
			"저조하게, 형편없이\n" +
			"\n" +
			"\n" +
			"\n" +
			"somewhat\n" +
			"다소, 좀\n" +
			"\n" +
			"\n" +
			"\n" +
			"rightly\n" +
			"정확하게, 당연히, 마땅하게\n" +
			"\n" +
			"\n" +
			"\n" +
			"respectfully\n" +
			"공손하게, 정중하게\n" +
			"\n" +
			"\n" +
			"\n" +
			"astonishingly\n" +
			"놀랍게도\n" +
			"\n" +
			"\n" +
			"\n" +
			"badly\n" +
			"몹시 심하게, 부당하게\n" +
			"\n" +
			"\n" +
			"\n" +
			"heavily\n" +
			"몹시 심하게\n" +
			"\n" +
			"\n" +
			"\n" +
			"regrettably\n" +
			"유감스럽게도\n" +
			"\n" +
			"\n" +
			"\n" +
			"luxuriously\n" +
			"사치스럽게, 방탕하게\n" +
			"\n" +
			"\n" +
			"\n" +
			"loudly\n" +
			"큰 소리로, 소란스럽게\n" +
			"\n" +
			"\n" +
			"\n" +
			"proudly\n" +
			"자랑스럽게\n" +
			"\n" +
			"\n" +
			"\n" +
			"overhead\n" +
			"머리 위에\n" +
			"\n" +
			"\n" +
			"\n" +
			"meanwhile\n" +
			"그동안에, 한편\n" +
			"\n" +
			"\n" +
			"\n" +
			"vastly\n" +
			"대단히, 엄청나게\n" +
			"\n" +
			"\n" +
			"\n" +
			"agreeably\n" +
			"기분 좋게, 유쾌하게\n" +
			"\n" +
			"\n" +
			"\n" +
			"ethically\n" +
			"윤리적으로, 도덕적으로\n" +
			"\n" +
			"\n" +
			"\n" +
			"unbearably\n" +
			"참을 수 없게, 견딜 수 없게\n" +
			"\n" +
			"\n" +
			"\n" +
			"undoubtedly\n" +
			"틀림없이, 의심할 여지 없이\n" +
			"\n" +
			"\n" +
			"\n" +
			"cordially\n" +
			"진심으로\n" +
			"\n" +
			"\n" +
			"\n" +
			"discreetly\n" +
			"분별있게, 사려 깊게\n" +
			"\n" +
			"\n" +
			"\n" +
			"inherently\n" +
			"본질적으로\n" +
			"\n" +
			"\n" +
			"\n" +
			"inevitably\n" +
			"필연적으로\n" +
			"\n" +
			"\n" +
			"\n" +
			"coincidentally\n" +
			"우연히, 동시 발생적으로\n" +
			"\n" +
			"\n" +
			"\n" +
			"boldly\n" +
			"대담하게\n" +
			"\n" +
			"\n" +
			"\n" +
			"loosely\n" +
			"느슨하게\n" +
			"\n" +
			"\n" +
			"\n" +
			"swiftly\n" +
			"빨리, 신속히\n" +
			"\n" +
			"\n" +
			"\n" +
			"in common\n" +
			"공통으로\n" +
			"\n" +
			"\n" +
			"\n" +
			"legally\n" +
			"법률적으로, 합법적으로(↔ illegally 불법적으로)\n" +
			"\n" +
			"\n" +
			"\n" +
			"technically\n" +
			"기술적으로, 전문적으로, 엄밀히 말하면\n" +
			"\n" +
			"\n" +
			"\n" +
			"involuntarily\n" +
			"모르는 사이에, 본의 아니게\n" +
			"\n" +
			"\n" +
			"\n" +
			"sparsely\n" +
			"희박하게, 드문드문하게\n" +
			"\n" +
			"\n" +
			"\n" +
			"decidedly\n" +
			"결정적으로, 명백하게\n" +
			"\n" +
			"\n" +
			"\n" +
			"allegedly\n" +
			"주장하는 바에 따르면\n" +
			"\n" +
			"\n" +
			"\n" +
			"namely\n" +
			"즉, 다시 말하면\n" +
			"\n" +
			"\n" +
			"\n" +
			"indeed\n" +
			"사실, 정말\n" +
			"\n" +
			"\n" +
			"\n" +
			"actually\n" +
			"실제로, 사실은\n" +
			"\n" +
			"\n" +
			"\n" +
			"lately\n" +
			"최근에\n" +
			"\n" +
			"\n" +
			"\n" +
			"gradually\n" +
			"점차, 서서히\n" +
			"\n" +
			"\n" +
			"\n" +
			"minimally\n" +
			"최소한으로\n" +
			"\n" +
			"\n" +
			"\n" +
			"correctly\n" +
			"정확하게, 올바르게\n" +
			"\n" +
			"\n" +
			"\n" +
			"sharply\n" +
			"급격하게, 날카롭게\n" +
			"\n" +
			"\n" +
			"\n" +
			"roughly\n" +
			"대략, 거의\n" +
			"\n" +
			"\n" +
			"\n" +
			"randomly\n" +
			"무작위로, 임의로\n" +
			"\n" +
			"\n" +
			"\n" +
			"openly\n" +
			"공개적으로, 공공연히\n" +
			"\n" +
			"\n" +
			"\n" +
			"hopefully\n" +
			"바라건대\n" +
			"\n" +
			"\n" +
			"\n" +
			"meaningfully\n" +
			"의미 있게, 의미심장하게\n" +
			"\n" +
			"\n" +
			"\n" +
			"broadly\n" +
			"광범위하게, 대체로\n" +
			"\n" +
			"\n" +
			"\n" +
			"carelessly\n" +
			"부주의하게, 경솔하게\n" +
			"\n" +
			"\n" +
			"\n" +
			"traditionally\n" +
			"전통적으로\n" +
			"\n" +
			"\n" +
			"\n" +
			"surprisingly\n" +
			"놀랍게도\n" +
			"\n" +
			"\n" +
			"\n" +
			"voluntarily\n" +
			"자발적으로\n" +
			"\n" +
			"\n" +
			"\n" +
			"obviously\n" +
			"분명히, 명백히\n" +
			"\n" +
			"\n" +
			"\n" +
			"regularly\n" +
			"정기적으로, 규칙적으로\n" +
			"\n" +
			"\n" +
			"\n" +
			"diligently\n" +
			"부지런히\n" +
			"\n" +
			"\n" +
			"\n" +
			"collectively\n" +
			"전체적으로, 총괄하여\n" +
			"\n" +
			"\n" +
			"\n" +
			"rightfully\n" +
			"정당하게, 마땅히\n" +
			"\n" +
			"\n" +
			"\n" +
			"loyally\n" +
			"성실히, 충성스럽게\n" +
			"\n" +
			"\n" +
			"\n" +
			"sensibly\n" +
			"분별있게\n" +
			"\n" +
			"\n" +
			"\n" +
			"substantially\n" +
			"실질적으로, 상당히\n" +
			"\n" +
			"\n" +
			"\n" +
			"significantly\n" +
			"상당히 의미 있게\n" +
			"\n" +
			"\n" +
			"\n" +
			"reluctantly\n" +
			"마지못해\n" +
			"\n" +
			"\n" +
			"\n" +
			"persuasively\n" +
			"설득력 있게\n" +
			"\n" +
			"\n" +
			"\n" +
			"repeatedly\n" +
			"반복적으로 되풀이하여\n" +
			"\n" +
			"\n" +
			"\n" +
			"improperly\n" +
			"부적절하게\n" +
			"\n" +
			"\n" +
			"\n" +
			"cautiously\n" +
			"조심스럽게\n" +
			"\n" +
			"\n" +
			"\n" +
			"convincingly\n" +
			"납득이 가도록, 설득력 있게\n" +
			"\n" +
			"\n" +
			"\n" +
			"utterly\n" +
			"완전히, 전혀\n" +
			"\n" +
			"\n" +
			"\n" +
			"deliberately\n" +
			"고의로, 의도적으로\n" +
			"\n" +
			"\n" +
			"\n" +
			"productively\n" +
			"생산적으로\n" +
			"\n" +
			"\n" +
			"\n" +
			"proportionately\n" +
			"비례하여, 균형에 맞게\n" +
			"\n" +
			"\n" +
			"\n" +
			"abruptly\n" +
			"불쑥, 갑자기\n" +
			"\n" +
			"\n" +
			"\n" +
			"abundantly\n" +
			"풍부하게, 많이\n" +
			"\n" +
			"\n" +
			"\n" +
			"functionally\n" +
			"기능상, 직무상\n" +
			"\n" +
			"\n" +
			"\n" +
			"variably\n" +
			"일정하지 않게\n" +
			"\n" +
			"\n" +
			"\n" +
			"proficiently\n" +
			"능숙하게\n" +
			"\n" +
			"\n" +
			"\n" +
			"spontaneously\n" +
			"자발적으로, 자연스럽게\n" +
			"\n" +
			"\n" +
			"\n" +
			"safety gear\n" +
			"안전 장치\n" +
			"\n" +
			"\n" +
			"\n" +
			"reclaim\n" +
			"되찾다\n" +
			"\n" +
			"\n" +
			"\n" +
			"earning\n" +
			"벌기, 소득, 수입\n" +
			"\n" +
			"\n" +
			"\n" +
			"property\n" +
			"재산, 소유물, 부동산\n" +
			"\n" +
			"\n" +
			"\n" +
			"act\n" +
			"행동, 행동하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"briefly\n" +
			"잠시, 간단히\n" +
			"\n" +
			"\n" +
			"\n" +
			"also\n" +
			"또한, 게다가\n" +
			"\n" +
			"\n" +
			"\n" +
			"downside\n" +
			"단점\n" +
			"\n" +
			"\n" +
			"\n" +
			"most\n" +
			"(형용사) 대부분의,가장 많은, (부사) 가장 많이, 매우, (대명사) 대부분\n" +
			"\n" +
			"\n" +
			"\n" +
			"business\n" +
			"사업, 사업체\n" +
			"\n" +
			"\n" +
			"\n" +
			"value\n" +
			"가치있게 생각하다, 평가하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"loan\n" +
			"대출, 빌려주다, 대여하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"staff\n" +
			"직원, 직원으로 일하다, 직원을 제공하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"would like\n" +
			"(공손히) 요청하다, 제안하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"evaluation\n" +
			"평가\n" +
			"\n" +
			"\n" +
			"\n" +
			"absence\n" +
			"결석, 결근, 부재\n" +
			"\n" +
			"\n" +
			"\n" +
			"exposition\n" +
			"설명, 전시회\n" +
			"\n" +
			"\n" +
			"\n" +
			"explain\n" +
			"설명하다, 해명하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"determine\n" +
			"밝히다, 결정하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"sale\n" +
			"판매, 매출, 영업\n" +
			"\n" +
			"\n" +
			"\n" +
			"monthly\n" +
			"매월, 매월의\n" +
			"\n" +
			"\n" +
			"\n" +
			"away\n" +
			"떨어져, 다른데, 자리에 없는\n" +
			"\n" +
			"\n" +
			"\n" +
			"while\n" +
			"~하는 동안\n" +
			"\n" +
			"\n" +
			"\n" +
			"cargo\n" +
			"화물\n" +
			"\n" +
			"\n" +
			"\n" +
			"shipping\n" +
			"선박, 해상 운송\n" +
			"\n" +
			"\n" +
			"\n" +
			"confused\n" +
			"혼란스러운\n" +
			"\n" +
			"\n" +
			"\n" +
			"observe\n" +
			"준수하다, 관찰하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"volunteer\n" +
			"자원 봉사자, 자원하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"accept\n" +
			"접수하다, 받다\n" +
			"\n" +
			"\n" +
			"\n" +
			"assist\n" +
			"돕다, 도움이 되다\n" +
			"\n" +
			"\n" +
			"\n" +
			"deliver\n" +
			"배송하다, (연설 등을) 하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"predict\n" +
			"예측하다, 예견하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"launch\n" +
			"시작하다, 출시하다, 출시\n" +
			"\n" +
			"\n" +
			"\n" +
			"assume\n" +
			"맡다, 추정하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"emphasize\n" +
			"강조하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"finalize\n" +
			"마무리짓다\n" +
			"\n" +
			"\n" +
			"\n" +
			"take on\n" +
			"떠맡다\n" +
			"\n" +
			"\n" +
			"\n" +
			"undertake\n" +
			"떠맡다\n" +
			"\n" +
			"\n" +
			"\n" +
			"takeover\n" +
			"떠맡다\n" +
			"\n" +
			"\n" +
			"\n" +
			"preparation\n" +
			"준비\n" +
			"\n" +
			"\n" +
			"\n" +
			"presently\n" +
			"현재\n" +
			"\n" +
			"\n" +
			"\n" +
			"present\n" +
			"현재의, 선물, 현재, 지금\n" +
			"\n" +
			"\n" +
			"\n" +
			"laboratory\n" +
			"실험실\n" +
			"\n" +
			"\n" +
			"\n" +
			"temperature\n" +
			"온도, 기온\n" +
			"\n" +
			"\n" +
			"\n" +
			"stability\n" +
			"안정, 안정성\n" +
			"\n" +
			"\n" +
			"\n" +
			"cosmetics\n" +
			"화장품\n" +
			"\n" +
			"\n" +
			"\n" +
			"specialize\n" +
			"전공하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"advertising\n" +
			"광고, 광고업\n" +
			"\n" +
			"\n" +
			"\n" +
			"theater\n" +
			"극장, 관객\n" +
			"\n" +
			"\n" +
			"\n" +
			"meet\n" +
			"만나다, 충족하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"manufacture\n" +
			"제조하다, 제조, 제품\n" +
			"\n" +
			"\n" +
			"\n" +
			"in a timely manner\n" +
			"적절한 시기에, 제 시간에\n" +
			"\n" +
			"\n" +
			"\n" +
			"refer\n" +
			"언급하다, 참조하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"refer to\n" +
			"(자동사) 참조하다, 관련되다\n" +
			"\n" +
			"\n" +
			"\n" +
			"gift token\n" +
			"상품권\n" +
			"\n" +
			"\n" +
			"\n" +
			"gift certificate\n" +
			"상품권\n" +
			"\n" +
			"\n" +
			"\n" +
			"gift voucher\n" +
			"상품권\n" +
			"\n" +
			"\n" +
			"\n" +
			"probably\n" +
			"아마\n" +
			"\n" +
			"\n" +
			"\n" +
			"retail\n" +
			"소매, 소매하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"come\n" +
			"오다, 제공되다, 포함되다\n" +
			"\n" +
			"\n" +
			"\n" +
			"appear\n" +
			"~인 것 같다, 나타나다\n" +
			"\n" +
			"\n" +
			"\n" +
			"probable\n" +
			"개연성 있는\n" +
			"\n" +
			"\n" +
			"\n" +
			"glassware\n" +
			"유리 제품\n" +
			"\n" +
			"\n" +
			"\n" +
			"sure\n" +
			"확신하는\n" +
			"\n" +
			"\n" +
			"\n" +
			"track\n" +
			"추적하다, 길, 자국\n" +
			"\n" +
			"\n" +
			"\n" +
			"distinguished\n" +
			"유명한, 성공한\n" +
			"\n" +
			"\n" +
			"\n" +
			"announce\n" +
			"발표하다, 알리다\n" +
			"\n" +
			"\n" +
			"\n" +
			"competitor\n" +
			"경쟁자, 참가자\n" +
			"\n" +
			"\n" +
			"\n" +
			"deal with\n" +
			"(자동사) ~을 다루다\n" +
			"\n" +
			"\n" +
			"\n" +
			"address\n" +
			"~을 다루다\n" +
			"\n" +
			"\n" +
			"\n" +
			"participate in\n" +
			"(자동사) ~에 참석하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"respond to\n" +
			"(자동사) ~에 응답하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"talk about\n" +
			"(자동사) ~에 대해 말하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"discuss\n" +
			"상의하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"rely upon\n" +
			"(자동사) ~에 의지하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"specialize in\n" +
			"(자동사) ~를 전문으로 하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"lead to\n" +
			"(자동사) ~로 이어지다\n" +
			"\n" +
			"\n" +
			"\n" +
			"attend to\n" +
			"(자동사) ~에 주의하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"contribute to\n" +
			"(자동사) ~에 기여하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"proceed\n" +
			"(자동사) 진행하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"appear\n" +
			"(자동사) 나타나다\n" +
			"\n" +
			"\n" +
			"\n" +
			"none\n" +
			"아무도, 아무것도\n" +
			"\n" +
			"\n" +
			"\n" +
			"anticipate\n" +
			"예상하다, 예측하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"come with\n" +
			"~가 따라오다\n" +
			"\n" +
			"\n" +
			"\n" +
			"admission\n" +
			"입장, 입장료, 가입, 이\n" +
			"\n" +
			"\n" +
			"\n" +
			"money-back guarantee\n" +
			"환불 보증\n" +
			"\n" +
			"\n" +
			"\n" +
			"on time\n" +
			"제시간에, 정각에\n" +
			"\n" +
			"\n" +
			"\n" +
			"cargo\n" +
			"화물\n" +
			"\n" +
			"\n" +
			"\n" +
			"carrier\n" +
			"운반 차량\n" +
			"\n" +
			"\n" +
			"\n" +
			"seek\n" +
			"찾다, 구하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"cosmetics\n" +
			"화장품\n" +
			"\n" +
			"\n" +
			"\n" +
			"attachment\n" +
			"첨부 파일\n" +
			"\n" +
			"\n" +
			"\n" +
			"usually\n" +
			"보통\n" +
			"\n" +
			"\n" +
			"\n" +
			"frequently\n" +
			"자주\n" +
			"\n" +
			"\n" +
			"\n" +
			"ago\n" +
			"~전에\n" +
			"\n" +
			"\n" +
			"\n" +
			"then\n" +
			"그때에\n" +
			"\n" +
			"\n" +
			"\n" +
			"previously\n" +
			"이전에\n" +
			"\n" +
			"\n" +
			"\n" +
			"starting\n" +
			"~부터\n" +
			"\n" +
			"\n" +
			"\n" +
			"as of\n" +
			"~부터\n" +
			"\n" +
			"\n" +
			"\n" +
			"presently\n" +
			"현재\n" +
			"\n" +
			"\n" +
			"\n" +
			"at the moment\n" +
			"지금\n" +
			"\n" +
			"\n" +
			"\n" +
			"at that time\n" +
			"그때\n" +
			"\n" +
			"\n" +
			"\n" +
			"inspector\n" +
			"검사관\n" +
			"\n" +
			"\n" +
			"\n" +
			"examine\n" +
			"점검하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"go through\n" +
			"~을 겪다\n" +
			"\n" +
			"\n" +
			"\n" +
			"establish\n" +
			"설립하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"bill\n" +
			"청구서, 청구서를 보내다\n" +
			"\n" +
			"\n" +
			"\n" +
			"award\n" +
			"수여하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"entry\n" +
			"출품작, 입장\n" +
			"\n" +
			"\n" +
			"\n" +
			"fair\n" +
			"타당한, 타당하게, 박람회\n" +
			"\n" +
			"\n" +
			"\n" +
			"alert\n" +
			"기민한, (위험 등을) 알리다, 경보\n" +
			"\n" +
			"\n" +
			"\n" +
			"be known for\n" +
			"~로 유명하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be qualified for\n" +
			"~에 적격이다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be required for\n" +
			"~을 위해 요구되다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be interested in\n" +
			"~에 관심 있다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be included in\n" +
			"~에 포함되다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be engaged in\n" +
			"~에 종사하다, 관여하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be pleased with\n" +
			"~로 기뻐하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be satisfied with\n" +
			"~에 만족하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be equipped with\n" +
			"~을 갖추고 있다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be provided with\n" +
			"~을 제공받다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be faced with\n" +
			"~에 직면하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be replaced with\n" +
			"~으로 교체되다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be based on\n" +
			"~에 기초를 두다\n" +
			"\n" +
			"\n" +
			"\n" +
			"attract\n" +
			"마음을 끌다, 끌어들이다\n" +
			"\n" +
			"\n" +
			"\n" +
			"maintain\n" +
			"유지하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"resolve\n" +
			"해결하다, 다짐하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"cooperate\n" +
			"협력하다, 협조하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"resign\n" +
			"사임하다, 물러나다\n" +
			"\n" +
			"\n" +
			"\n" +
			"commence\n" +
			"시작되다, 시작하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"confirm\n" +
			"확인하다, 확정하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"freeze\n" +
			"얼다\n" +
			"\n" +
			"\n" +
			"\n" +
			"profitable\n" +
			"수익성이 있는\n" +
			"\n" +
			"\n" +
			"\n" +
			"operating cost\n" +
			"운영비\n" +
			"\n" +
			"\n" +
			"\n" +
			"expert judge\n" +
			"전문 심사위원\n" +
			"\n" +
			"\n" +
			"\n" +
			"revenue\n" +
			"수익\n" +
			"\n" +
			"\n" +
			"\n" +
			"desk clerk\n" +
			"접수 담당자\n" +
			"\n" +
			"\n" +
			"\n" +
			"banking\n" +
			"은행업\n" +
			"\n" +
			"\n" +
			"\n" +
			"at all times\n" +
			"항상\n" +
			"\n" +
			"\n" +
			"\n" +
			"strive to\n" +
			"~하려고 노력하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"spokesperson\n" +
			"대변인\n" +
			"\n" +
			"\n" +
			"\n" +
			"cuisine\n" +
			"요리, 요리법\n" +
			"\n" +
			"\n" +
			"\n" +
			"essential\n" +
			"필수적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"intend\n" +
			"의도하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"tend\n" +
			"경향이 있다\n" +
			"\n" +
			"\n" +
			"\n" +
			"afford\n" +
			"여유가 있다\n" +
			"\n" +
			"\n" +
			"\n" +
			"strive\n" +
			"노력하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"refuse\n" +
			"거절하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"reply\n" +
			"대답, 대답하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"a plan to부정사\n" +
			"~할 계획\n" +
			"\n" +
			"\n" +
			"\n" +
			"a way to부정사\n" +
			"~할 방법\n" +
			"\n" +
			"\n" +
			"\n" +
			"a right to부정사\n" +
			"~할 권리\n" +
			"\n" +
			"\n" +
			"\n" +
			"an effort to부정사\n" +
			"~하려는 노력\n" +
			"\n" +
			"\n" +
			"\n" +
			"a time to부정사\n" +
			"~할 시간\n" +
			"\n" +
			"\n" +
			"\n" +
			"an ability to부정사\n" +
			"~할 능력\n" +
			"\n" +
			"\n" +
			"\n" +
			"an attempt to부정사\n" +
			"~하려는 시도\n" +
			"\n" +
			"\n" +
			"\n" +
			"a chance to부정사\n" +
			"~할 기회\n" +
			"\n" +
			"\n" +
			"\n" +
			"an opportunity to부정사\n" +
			"~할 기회\n" +
			"\n" +
			"\n" +
			"\n" +
			"honor\n" +
			"기리다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be eager to부정사\n" +
			"~하기를 열망하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be able to부정사\n" +
			"~을 할 수 있다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be unable to부정사\n" +
			"~을 할 수 없다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be sure to부정사\n" +
			"반드시 ~하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be honored to부정사\n" +
			"~하게 되어 영광이다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be likely to부정사\n" +
			"~할 것 같다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be asked to부정사\n" +
			"~하도록 요청받다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be scheduled to부정사\n" +
			"~할 예정이다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be supposed to부정사\n" +
			"~하기로 되어 있다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be advised to부정사\n" +
			"~하도록 권고받다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be please to부정사\n" +
			"~해서 기쁘다\n" +
			"\n" +
			"\n" +
			"\n" +
			"encourage\n" +
			"격려하다, 권장하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"sales associate\n" +
			"영업 사원\n" +
			"\n" +
			"\n" +
			"\n" +
			"stop in at\n" +
			"~에 들르다\n" +
			"\n" +
			"\n" +
			"\n" +
			"roadwork\n" +
			"도로 공사\n" +
			"\n" +
			"\n" +
			"\n" +
			"keep\n" +
			"유지하다, 계속하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"avoid\n" +
			"피하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"give up\n" +
			"포기하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"give quit\n" +
			"포기하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"put off\n" +
			"연기하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"mind\n" +
			"꺼리다\n" +
			"\n" +
			"\n" +
			"\n" +
			"discontinue\n" +
			"중단하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"patron\n" +
			"고객\n" +
			"\n" +
			"\n" +
			"\n" +
			"diverse\n" +
			"다양한\n" +
			"\n" +
			"\n" +
			"\n" +
			"penalty fee\n" +
			"벌급, 위약금\n" +
			"\n" +
			"\n" +
			"\n" +
			"on -ing\n" +
			"~하자마자\n" +
			"\n" +
			"\n" +
			"\n" +
			"upon -ing\n" +
			"~하자마자\n" +
			"\n" +
			"\n" +
			"\n" +
			"be busy -ing\n" +
			"~하느라 바쁘다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be capable of -ing\n" +
			"~할 수 있다\n" +
			"\n" +
			"\n" +
			"\n" +
			"have trouble -ing\n" +
			"~하는 데 어려움이 있다\n" +
			"\n" +
			"\n" +
			"\n" +
			"prevent A from -ing\n" +
			"A가 ~하는 것을 막다\n" +
			"\n" +
			"\n" +
			"\n" +
			"adapt to -ing\n" +
			"~에 적응하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"object to -ing\n" +
			"~에 반대하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"look forward to -ing\n" +
			"~을 고대하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"pay attention to -ing\n" +
			"~하는 데 유의하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be related to -ing\n" +
			"~와 관련되다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be opposed to -ing\n" +
			"~에 반대하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be dedicated to -ing\n" +
			"~에 헌신하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be devoted to -ing\n" +
			"~에 헌신하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be committed to -ing\n" +
			"~에 전념하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be accustomed to -ing\n" +
			"~에 익숙하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be used to -ing\n" +
			"~에 익숙하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"rising\n" +
			"오르는, 증가하는\n" +
			"\n" +
			"\n" +
			"\n" +
			"adopt\n" +
			"채택하다, 도입하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"broaden\n" +
			"넓히다, 확대하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"arrange\n" +
			"마련하다, 정리하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"ensure\n" +
			"보장하다, 확실하게 하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"issue\n" +
			"발행하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"dispose\n" +
			"처리하다, 배치하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"resume\n" +
			"재개하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"accommodate\n" +
			"수용하다, 숙박시키다\n" +
			"\n" +
			"\n" +
			"\n" +
			"notify\n" +
			"알리다, 통지하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"identify\n" +
			"확인하다, 찾다\n" +
			"\n" +
			"\n" +
			"\n" +
			"occupy\n" +
			"차지하다, 사용하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"familiarize\n" +
			"익숙하게 하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"suspend\n" +
			"중단하다, 유보하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"potential\n" +
			"잠재적인, 잠재력\n" +
			"\n" +
			"\n" +
			"\n" +
			"sensitive\n" +
			"민감한\n" +
			"\n" +
			"\n" +
			"\n" +
			"efficiency\n" +
			"효율, 효율성\n" +
			"\n" +
			"\n" +
			"\n" +
			"aspiring\n" +
			"열망하는, 장차 ~가 되려는\n" +
			"\n" +
			"\n" +
			"\n" +
			"safety protocols\n" +
			"안전 규약\n" +
			"\n" +
			"\n" +
			"\n" +
			"comply with\n" +
			"~을 준수하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"overall\n" +
			"전반적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"head landscaper\n" +
			"수석 조경사\n" +
			"\n" +
			"\n" +
			"\n" +
			"be in line with\n" +
			"~와 일치하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"farewell gathering\n" +
			"송별 모임\n" +
			"\n" +
			"\n" +
			"\n" +
			"apply to\n" +
			"~에 적용되다\n" +
			"\n" +
			"\n" +
			"\n" +
			"plant\n" +
			"식물, 공장, 심다\n" +
			"\n" +
			"\n" +
			"\n" +
			"according to\n" +
			"(전치사) ~에 따르면\n" +
			"\n" +
			"\n" +
			"\n" +
			"rapid\n" +
			"빠른\n" +
			"\n" +
			"\n" +
			"\n" +
			"reserve\n" +
			"예약하다, 보류하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"stability\n" +
			"안정, 안정성\n" +
			"\n" +
			"\n" +
			"\n" +
			"announce\n" +
			"발표하다, 선언하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"commence\n" +
			"시작되다, 시작하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"concern\n" +
			"영향을 미치다, 걱정\n" +
			"\n" +
			"\n" +
			"\n" +
			"acquire\n" +
			"습득하다, 획득하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"management\n" +
			"경영, 경영진, 관리\n" +
			"\n" +
			"\n" +
			"\n" +
			"accord\n" +
			"합의, 부여하다, 부합하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"beside\n" +
			"(전치사) 옆에, ~에 비해\n" +
			"\n" +
			"\n" +
			"\n" +
			"besides\n" +
			"(전치사) ~외에, (부사) 게다가, 또(한)\n" +
			"\n" +
			"\n" +
			"\n" +
			"however\n" +
			"아무리 ~해도, 하지만, 그러나\n" +
			"\n" +
			"\n" +
			"\n" +
			"wore\n" +
			"입다(wear의 과거형)\n" +
			"\n" +
			"\n" +
			"\n" +
			"rapidly\n" +
			"빠르게, 급격히\n" +
			"\n" +
			"\n" +
			"\n" +
			"approaching summer\n" +
			"다가오는 여름\n" +
			"\n" +
			"\n" +
			"\n" +
			"existing equipment\n" +
			"기존 장비\n" +
			"\n" +
			"\n" +
			"\n" +
			"leading complaints\n" +
			"주된 불만 사항들\n" +
			"\n" +
			"\n" +
			"\n" +
			"promising location\n" +
			"유망한 지역\n" +
			"\n" +
			"\n" +
			"\n" +
			"rising prices\n" +
			"오르는 가격\n" +
			"\n" +
			"\n" +
			"\n" +
			"desired results\n" +
			"바라던 결과\n" +
			"\n" +
			"\n" +
			"\n" +
			"proposed initiative\n" +
			"제안된 계획안\n" +
			"\n" +
			"\n" +
			"\n" +
			"required document\n" +
			"필요 서류\n" +
			"\n" +
			"\n" +
			"\n" +
			"qualified candidates\n" +
			"자격을 갖춘 지원자들\n" +
			"\n" +
			"\n" +
			"\n" +
			"interesting\n" +
			"흥미로운, 재미있는\n" +
			"\n" +
			"\n" +
			"\n" +
			"interested\n" +
			"흥미 있는\n" +
			"\n" +
			"\n" +
			"\n" +
			"confusing\n" +
			"혼란스러운\n" +
			"\n" +
			"\n" +
			"\n" +
			"disappointed\n" +
			"실망한\n" +
			"\n" +
			"\n" +
			"\n" +
			"embarrassing\n" +
			"난처한, 당황스러운\n" +
			"\n" +
			"\n" +
			"\n" +
			"embarrassed\n" +
			"쑥스러운, 어색한, 당황스러운\n" +
			"\n" +
			"\n" +
			"\n" +
			"exciting\n" +
			"신난, 흥미진진한\n" +
			"\n" +
			"\n" +
			"\n" +
			"excited\n" +
			"신난, 즐거운\n" +
			"\n" +
			"\n" +
			"\n" +
			"amazing\n" +
			"놀라운\n" +
			"\n" +
			"\n" +
			"\n" +
			"amazed\n" +
			"놀란\n" +
			"\n" +
			"\n" +
			"\n" +
			"surprising\n" +
			"놀라운\n" +
			"\n" +
			"\n" +
			"\n" +
			"surprised\n" +
			"놀란\n" +
			"\n" +
			"\n" +
			"\n" +
			"frustrating\n" +
			"불만스러운, 좌절감을 주는\n" +
			"\n" +
			"\n" +
			"\n" +
			"frustrated\n" +
			"불만스러운, 좌절한\n" +
			"\n" +
			"\n" +
			"\n" +
			"tiring\n" +
			"피곤한, 피곤하게 하는\n" +
			"\n" +
			"\n" +
			"\n" +
			"tired\n" +
			"지친, 피곤한\n" +
			"\n" +
			"\n" +
			"\n" +
			"satisfying\n" +
			"만족스러운, 만족감을 주는\n" +
			"\n" +
			"\n" +
			"\n" +
			"spacious\n" +
			"널찍한\n" +
			"\n" +
			"\n" +
			"\n" +
			"fuel efficient\n" +
			"연료 효율이 높은\n" +
			"\n" +
			"\n" +
			"\n" +
			"law firm\n" +
			"법률 회사\n" +
			"\n" +
			"\n" +
			"\n" +
			"local\n" +
			"지역의, 현지의\n" +
			"\n" +
			"\n" +
			"\n" +
			"legal\n" +
			"법적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"formal\n" +
			"공식적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"seasonal\n" +
			"계절의, 제철의\n" +
			"\n" +
			"\n" +
			"\n" +
			"potential\n" +
			"잠재적인, 잠재력\n" +
			"\n" +
			"\n" +
			"\n" +
			"remaining inventory\n" +
			"남아있는 재고\n" +
			"\n" +
			"\n" +
			"\n" +
			"residential\n" +
			"주택지의, 주거의\n" +
			"\n" +
			"\n" +
			"\n" +
			"managerial\n" +
			"관리의, 경영의\n" +
			"\n" +
			"\n" +
			"\n" +
			"affordable\n" +
			"적당한, 저렴한\n" +
			"\n" +
			"\n" +
			"\n" +
			"favorable\n" +
			"호의적인, 유리한\n" +
			"\n" +
			"\n" +
			"\n" +
			"considerable\n" +
			"상당한, 많은\n" +
			"\n" +
			"\n" +
			"\n" +
			"valuable\n" +
			"소중한, 귀중한\n" +
			"\n" +
			"\n" +
			"\n" +
			"probable\n" +
			"가능성 있는, 유망한\n" +
			"\n" +
			"\n" +
			"\n" +
			"multiple\n" +
			"많은, 다수의\n" +
			"\n" +
			"\n" +
			"\n" +
			"import\n" +
			"수입, 수입품, 수입하다, 불러오다\n" +
			"\n" +
			"\n" +
			"\n" +
			"adjacent\n" +
			"인접한, 가까운\n" +
			"\n" +
			"\n" +
			"\n" +
			"adjacent to\n" +
			"인접한, 가까운\n" +
			"\n" +
			"\n" +
			"\n" +
			"flight\n" +
			"여행, 비행, 항공편, 차다\n" +
			"\n" +
			"\n" +
			"\n" +
			"redirect\n" +
			"다시 보내다, 돌려쓰다\n" +
			"\n" +
			"\n" +
			"\n" +
			"energy efficient\n" +
			"에너지 효율이 좋은\n" +
			"\n" +
			"\n" +
			"\n" +
			"manufacture\n" +
			"제조하다, 제조, 제품\n" +
			"\n" +
			"\n" +
			"\n" +
			"approach\n" +
			"다가가다, 접근법\n" +
			"\n" +
			"\n" +
			"\n" +
			"expand\n" +
			"확대되다, 확대시키다\n" +
			"\n" +
			"\n" +
			"\n" +
			"neighboring\n" +
			"이웃의, 근접한\n" +
			"\n" +
			"\n" +
			"\n" +
			"open\n" +
			"열려있는, 열다, 야외\n" +
			"\n" +
			"\n" +
			"\n" +
			"until\n" +
			"(접속사, 전치사) ~까지\n" +
			"\n" +
			"\n" +
			"\n" +
			"electrical\n" +
			"전기의\n" +
			"\n" +
			"\n" +
			"\n" +
			"featrue\n" +
			"특징, 특징으로 삼다\n" +
			"\n" +
			"\n" +
			"\n" +
			"bistro\n" +
			"작은 식당\n" +
			"\n" +
			"\n" +
			"\n" +
			"prepare\n" +
			"준비하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"gourmet bean\n" +
			"고급 원두\n" +
			"\n" +
			"\n" +
			"\n" +
			"anyone\n" +
			"누구나\n" +
			"\n" +
			"\n" +
			"\n" +
			"for\n" +
			"(목적) ~을 위해, (대상) ~에게, (기간) ~동안, (이유) ~때문에, ~에 대해서\n" +
			"\n" +
			"\n" +
			"\n" +
			"right\n" +
			"(형용사) 올바른, (부사) 바로, (명사) 권리, 오른쪽\n" +
			"\n" +
			"\n" +
			"\n" +
			"otherwise\n" +
			"그렇지 않으면, 그 외에는\n" +
			"\n" +
			"\n" +
			"\n" +
			"as if\n" +
			"마치 ~인 것처럼, 흡사 ~와도 같이\n" +
			"\n" +
			"\n" +
			"\n" +
			"although\n" +
			"~이긴 하지만, 그러나, 하지만\n" +
			"\n" +
			"\n" +
			"\n" +
			"therefore\n" +
			"그러므로, 그러니\n" +
			"\n" +
			"\n" +
			"\n" +
			"bowl\n" +
			"그릇, 통, 공을 굴리다\n" +
			"\n" +
			"\n" +
			"\n" +
			"among\n" +
			"~에 둘러싸인, ~중에서\n" +
			"\n" +
			"\n" +
			"\n" +
			"fare\n" +
			"요금, 승객, 음식\n" +
			"\n" +
			"\n" +
			"\n" +
			"diner\n" +
			"식사하는 사람, 작은 식당\n" +
			"\n" +
			"\n" +
			"\n" +
			"official opening\n" +
			"정식 개업\n" +
			"\n" +
			"\n" +
			"\n" +
			"portrait\n" +
			"초상화\n" +
			"\n" +
			"\n" +
			"\n" +
			"preview\n" +
			"시사회, 시사평, 시사평을 쓰다\n" +
			"\n" +
			"\n" +
			"\n" +
			"enthusiast\n" +
			"열렬한 지지자\n" +
			"\n" +
			"\n" +
			"\n" +
			"lever\n" +
			"레버, 지렛대\n" +
			"\n" +
			"\n" +
			"\n" +
			"underneath\n" +
			"~의 밑에, 속으로 밑면\n" +
			"\n" +
			"\n" +
			"\n" +
			"desire\n" +
			"욕구, 바람, 바라다\n" +
			"\n" +
			"\n" +
			"\n" +
			"height\n" +
			"높이, 키\n" +
			"\n" +
			"\n" +
			"\n" +
			"wing\n" +
			"별관\n" +
			"\n" +
			"\n" +
			"\n" +
			"most\n" +
			"최대, 대부분, 가장, 최고로\n" +
			"\n" +
			"\n" +
			"\n" +
			"residence\n" +
			"주택, 거주지\n" +
			"\n" +
			"\n" +
			"\n" +
			"be honored toV\n" +
			"~하게돼서 기쁘다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be pleased toV\n" +
			"~하게돼서 기쁘다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be delighted toV\n" +
			"~하게돼서 기쁘다\n" +
			"\n" +
			"\n" +
			"\n" +
			"considerate\n" +
			"사려깊은, 배려하는\n" +
			"\n" +
			"\n" +
			"\n" +
			"in person\n" +
			"직접\n" +
			"\n" +
			"\n" +
			"\n" +
			"in Ving\n" +
			"~하는데 있어서\n" +
			"\n" +
			"\n" +
			"\n" +
			"on Ving\n" +
			"~하자마자\n" +
			"\n" +
			"\n" +
			"\n" +
			"upon Ving\n" +
			"~하자마자\n" +
			"\n" +
			"\n" +
			"\n" +
			"toward\n" +
			"~쯤, 무렵\n" +
			"\n" +
			"\n" +
			"\n" +
			"domestic\n" +
			"국내의, 가정의, 가정부\n" +
			"\n" +
			"\n" +
			"\n" +
			"cider\n" +
			"사과주\n" +
			"\n" +
			"\n" +
			"\n" +
			"responsibility\n" +
			"책임, 의무\n" +
			"\n" +
			"\n" +
			"\n" +
			"wise\n" +
			"지혜로운, 현명한\n" +
			"\n" +
			"\n" +
			"\n" +
			"enthusiastically\n" +
			"열정적으로\n" +
			"\n" +
			"\n" +
			"\n" +
			"enthusiastic\n" +
			"열렬한, 열정적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"enthusiasm\n" +
			"열정\n" +
			"\n" +
			"\n" +
			"\n" +
			"enthuse\n" +
			"열변을 토하다, 열광하게 만들다\n" +
			"\n" +
			"\n" +
			"\n" +
			"wheel\n" +
			"바퀴, 핸들, (바퀴 달린 것을) 밀다, 태우고 가다\n" +
			"\n" +
			"\n" +
			"\n" +
			"alignment\n" +
			"가지런함, 지지\n" +
			"\n" +
			"\n" +
			"\n" +
			"wheel alignment\n" +
			"휠 얼라인먼트\n" +
			"\n" +
			"\n" +
			"\n" +
			"willing\n" +
			"기꺼이 하는\n" +
			"\n" +
			"\n" +
			"\n" +
			"assort\n" +
			"분류하다, 어울리다\n" +
			"\n" +
			"\n" +
			"\n" +
			"prohibit\n" +
			"금지하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"bother\n" +
			"신경쓰다, 괴롭히다\n" +
			"\n" +
			"\n" +
			"\n" +
			"tailor\n" +
			"재단사, 조정하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"suit\n" +
			"정장, 어울리다\n" +
			"\n" +
			"\n" +
			"\n" +
			"above\n" +
			"(전치사) ~보다 위에, ~보다 많은, (부사) 위에, ~이상으로\n" +
			"\n" +
			"\n" +
			"\n" +
			"far\n" +
			"멀리, 멀리 있는\n" +
			"\n" +
			"\n" +
			"\n" +
			"publicist\n" +
			"홍보 담당자\n" +
			"\n" +
			"\n" +
			"\n" +
			"renowned\n" +
			"유명한\n" +
			"\n" +
			"\n" +
			"\n" +
			"northbound\n" +
			"북쪽으로 향하는\n" +
			"\n" +
			"\n" +
			"\n" +
			"reinforcement\n" +
			"증강 병력, 강화\n" +
			"\n" +
			"\n" +
			"\n" +
			"competitively\n" +
			"경쟁적으로\n" +
			"\n" +
			"\n" +
			"\n" +
			"representative\n" +
			"대표, 대리인, 대표하는, 전형적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"at\n" +
			"(시각) ~에, (장소) 에서\n" +
			"\n" +
			"\n" +
			"\n" +
			"on\n" +
			"~에 관하여, (시각) ~에, (장소) ~위에, ~에서\n" +
			"\n" +
			"\n" +
			"\n" +
			"in\n" +
			"(시각) ~에, (장소) ~에서\n" +
			"\n" +
			"\n" +
			"\n" +
			"from\n" +
			"~부터\n" +
			"\n" +
			"\n" +
			"\n" +
			"since\n" +
			"~이래로 쭉\n" +
			"\n" +
			"\n" +
			"\n" +
			"by\n" +
			"~까지(완료), ~의 옆에, ~으로, ~을 타고, ~만큼, ~에 의해\n" +
			"\n" +
			"\n" +
			"\n" +
			"before\n" +
			"~전에\n" +
			"\n" +
			"\n" +
			"\n" +
			"prior to\n" +
			"~전에\n" +
			"\n" +
			"\n" +
			"\n" +
			"after\n" +
			"~후에\n" +
			"\n" +
			"\n" +
			"\n" +
			"toward\n" +
			"쯤, 무렵\n" +
			"\n" +
			"\n" +
			"\n" +
			"for\n" +
			"(목적) ~을 위해, (대상) ~에게, (기간) ~동안, (이유) ~때문에, ~에 대해서\n" +
			"\n" +
			"\n" +
			"\n" +
			"over\n" +
			"(장소) ~위에, (기간) ~동안\n" +
			"\n" +
			"\n" +
			"\n" +
			"during\n" +
			"~동안\n" +
			"\n" +
			"\n" +
			"\n" +
			"throughout\n" +
			"~ 곳곳에, (기간) ~내내\n" +
			"\n" +
			"\n" +
			"\n" +
			"within 기간\n" +
			"~이내에\n" +
			"\n" +
			"\n" +
			"\n" +
			"at\n" +
			"(시각) ~에, (장소) 에서\n" +
			"\n" +
			"\n" +
			"\n" +
			"in 국가/도시명/공간\n" +
			"~에서\n" +
			"\n" +
			"\n" +
			"\n" +
			"on\n" +
			"~에 관하여, (시각) ~에, (장소) ~위에, ~에서\n" +
			"\n" +
			"\n" +
			"\n" +
			"by\n" +
			"~까지(완료), ~의 옆에, ~으로, ~을 타고, ~만큼, ~에 의해\n" +
			"\n" +
			"\n" +
			"\n" +
			"beside\n" +
			"~의 옆에\n" +
			"\n" +
			"\n" +
			"\n" +
			"next to\n" +
			"~의 옆에\n" +
			"\n" +
			"\n" +
			"\n" +
			"behind\n" +
			"~의 뒤에\n" +
			"\n" +
			"\n" +
			"\n" +
			"near\n" +
			"(전치사) ~에서 가까이, (형용사) 가까운, (부사) 가까이\n" +
			"\n" +
			"\n" +
			"\n" +
			"around\n" +
			"~의 주위에\n" +
			"\n" +
			"\n" +
			"\n" +
			"across\n" +
			"(전치사) ~에 걸쳐, (부사) 건너서\n" +
			"\n" +
			"\n" +
			"\n" +
			"between\n" +
			"(둘) 사이에\n" +
			"\n" +
			"\n" +
			"\n" +
			"among\n" +
			"(셋 이상) 사이에\n" +
			"\n" +
			"\n" +
			"\n" +
			"from\n" +
			"~부터\n" +
			"\n" +
			"\n" +
			"\n" +
			"to\n" +
			"~로, ~에게\n" +
			"\n" +
			"\n" +
			"\n" +
			"inside\n" +
			"~으로, ~안에\n" +
			"\n" +
			"\n" +
			"\n" +
			"through\n" +
			"~을 통하여\n" +
			"\n" +
			"\n" +
			"\n" +
			"by\n" +
			"~까지(완료), ~의 옆에, ~으로, ~을 타고, ~만큼, ~에 의해\n" +
			"\n" +
			"\n" +
			"\n" +
			"with\n" +
			"~으로, ~하게\n" +
			"\n" +
			"\n" +
			"\n" +
			"without\n" +
			"~없이\n" +
			"\n" +
			"\n" +
			"\n" +
			"on\n" +
			"~에 관하여, (시각) ~에, (장소) ~위에, ~에서\n" +
			"\n" +
			"\n" +
			"\n" +
			"over\n" +
			"(장소) ~위에, (기간) ~동안\n" +
			"\n" +
			"\n" +
			"\n" +
			"in\n" +
			"(시각) ~에, (장소) ~에서\n" +
			"\n" +
			"\n" +
			"\n" +
			"except\n" +
			"~을 제외하고\n" +
			"\n" +
			"\n" +
			"\n" +
			"except for\n" +
			"~을 제외하고\n" +
			"\n" +
			"\n" +
			"\n" +
			"because of\n" +
			"~ 때문에\n" +
			"\n" +
			"\n" +
			"\n" +
			"due to\n" +
			"~ 때문에\n" +
			"\n" +
			"\n" +
			"\n" +
			"owing to\n" +
			"~ 때문에\n" +
			"\n" +
			"\n" +
			"\n" +
			"despite\n" +
			"~에도 불구하고\n" +
			"\n" +
			"\n" +
			"\n" +
			"ahead of\n" +
			"~ 전에\n" +
			"\n" +
			"\n" +
			"\n" +
			"instead of\n" +
			"~ 대신에\n" +
			"\n" +
			"\n" +
			"\n" +
			"in addition to\n" +
			"(전치사) ~에 더하여, ~ 뿐만 아니라\n" +
			"\n" +
			"\n" +
			"\n" +
			"regardless of\n" +
			"~와 상관없이\n" +
			"\n" +
			"\n" +
			"\n" +
			"in case of\n" +
			"~의 경우에\n" +
			"\n" +
			"\n" +
			"\n" +
			"in the event of\n" +
			"~의 경우에\n" +
			"\n" +
			"\n" +
			"\n" +
			"in preparation for\n" +
			"~을 대비하여\n" +
			"\n" +
			"\n" +
			"\n" +
			"including\n" +
			"(전치사) ~을 포함하여\n" +
			"\n" +
			"\n" +
			"\n" +
			"beginning\n" +
			"(전치사) ~부터\n" +
			"\n" +
			"\n" +
			"\n" +
			"following\n" +
			"(전치사) ~ 이후에\n" +
			"\n" +
			"\n" +
			"\n" +
			"considering\n" +
			"(전치사) ~을 고려하면\n" +
			"\n" +
			"\n" +
			"\n" +
			"regarding\n" +
			"(전치사) ~에 관하여\n" +
			"\n" +
			"\n" +
			"\n" +
			"concerning\n" +
			"(전치사) ~에 관하여\n" +
			"\n" +
			"\n" +
			"\n" +
			"souvenir\n" +
			"기념품\n" +
			"\n" +
			"\n" +
			"\n" +
			"take place\n" +
			"개최되다\n" +
			"\n" +
			"\n" +
			"\n" +
			"shut off\n" +
			"멈추다, 중지하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"negotiation\n" +
			"협상\n" +
			"\n" +
			"\n" +
			"\n" +
			"massive\n" +
			"엄청난, 거대한\n" +
			"\n" +
			"\n" +
			"\n" +
			"impressive\n" +
			"인상적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"innovative\n" +
			"혁신적인, 획기적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"defective\n" +
			"결함 있는, 불량인\n" +
			"\n" +
			"\n" +
			"\n" +
			"constructive\n" +
			"건설적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"consecutive\n" +
			"연이은\n" +
			"\n" +
			"\n" +
			"\n" +
			"satisfactory\n" +
			"만족스러운\n" +
			"\n" +
			"\n" +
			"\n" +
			"supervisory\n" +
			"감독의, 관리의\n" +
			"\n" +
			"\n" +
			"\n" +
			"convenient\n" +
			"편리한, 간편한\n" +
			"\n" +
			"\n" +
			"\n" +
			"superior\n" +
			"우수한, 상관의, 상급자\n" +
			"\n" +
			"\n" +
			"\n" +
			"sufficient\n" +
			"충분한\n" +
			"\n" +
			"\n" +
			"\n" +
			"new hire\n" +
			"신입 사원\n" +
			"\n" +
			"\n" +
			"\n" +
			"postpone\n" +
			"연기하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"stock\n" +
			"재고, 주식, 채우다\n" +
			"\n" +
			"\n" +
			"\n" +
			"flooding\n" +
			"홍수\n" +
			"\n" +
			"\n" +
			"\n" +
			"downtown\n" +
			"(부사) 시내에\n" +
			"\n" +
			"\n" +
			"\n" +
			"fourth\n" +
			"네 번째의\n" +
			"\n" +
			"\n" +
			"\n" +
			"fall\n" +
			"떨어지다\n" +
			"\n" +
			"\n" +
			"\n" +
			"harvest\n" +
			"수확\n" +
			"\n" +
			"\n" +
			"\n" +
			"in exchange for\n" +
			"~대신의, 교환으로\n" +
			"\n" +
			"\n" +
			"\n" +
			"along with\n" +
			"(전치사) ~와 함께, ~에 더하여\n" +
			"\n" +
			"\n" +
			"\n" +
			"regard\n" +
			"~을 ~으로 여기다(평가하다), 관심, 존경\n" +
			"\n" +
			"\n" +
			"\n" +
			"letter\n" +
			"편지\n" +
			"\n" +
			"\n" +
			"\n" +
			"period\n" +
			"기간, 시기\n" +
			"\n" +
			"\n" +
			"\n" +
			"along\n" +
			"(전치사) ~을 따라\n" +
			"\n" +
			"\n" +
			"\n" +
			"in accordance with\n" +
			"(전치사) ~에 따라서\n" +
			"\n" +
			"\n" +
			"\n" +
			"arrival\n" +
			"도착, 도착한 사람\n" +
			"\n" +
			"\n" +
			"\n" +
			"visit\n" +
			"방문, 방문하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"for free\n" +
			"무료로\n" +
			"\n" +
			"\n" +
			"\n" +
			"until further notice\n" +
			"추후 공지가 있을 때까지\n" +
			"\n" +
			"\n" +
			"\n" +
			"onto\n" +
			"~로, ~쪽으로\n" +
			"\n" +
			"\n" +
			"\n" +
			"benefit dinner\n" +
			"자선 만찬\n" +
			"\n" +
			"\n" +
			"\n" +
			"twofold\n" +
			"이중적인, 두 배의\n" +
			"\n" +
			"\n" +
			"\n" +
			"related to\n" +
			"(전치사) ~와 관련된\n" +
			"\n" +
			"\n" +
			"\n" +
			"indecisive\n" +
			"우유부단한\n" +
			"\n" +
			"\n" +
			"\n" +
			"al least\n" +
			"(부사) 적어도, 최소한\n" +
			"\n" +
			"\n" +
			"\n" +
			"automate\n" +
			"자동화하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"automation\n" +
			"자동화\n" +
			"\n" +
			"\n" +
			"\n" +
			"debit\n" +
			"인출하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"hold\n" +
			"잡다, 잡기, 정지\n" +
			"\n" +
			"\n" +
			"\n" +
			"downtown\n" +
			"(부사) 시내에\n" +
			"\n" +
			"\n" +
			"\n" +
			"fourth\n" +
			"네 번째의\n" +
			"\n" +
			"\n" +
			"\n" +
			"harvest\n" +
			"수확\n" +
			"\n" +
			"\n" +
			"\n" +
			"in exchange for\n" +
			"~대신의, 교환으로\n" +
			"\n" +
			"\n" +
			"\n" +
			"along with\n" +
			"(전치사) ~와 함께, ~에 더하여\n" +
			"\n" +
			"\n" +
			"\n" +
			"regard\n" +
			"~을 ~으로 여기다(평가하다), 관심, 존경\n" +
			"\n" +
			"\n" +
			"\n" +
			"as well\n" +
			"(부사) 또한, 역시\n" +
			"\n" +
			"\n" +
			"\n" +
			"provided that\n" +
			"(접속사) ~하는 조건으로, ~하는 한\n" +
			"\n" +
			"\n" +
			"\n" +
			"sculpture\n" +
			"조각품, 조각\n" +
			"\n" +
			"\n" +
			"\n" +
			"period\n" +
			"기간, 시기\n" +
			"\n" +
			"\n" +
			"\n" +
			"in accordance with\n" +
			"(전치사) ~에 따라서\n" +
			"\n" +
			"\n" +
			"\n" +
			"for free\n" +
			"(부사) 무료로\n" +
			"\n" +
			"\n" +
			"\n" +
			"as\n" +
			"(전치사) ~처럼, ~로, (부사) ~만큼\n" +
			"\n" +
			"\n" +
			"\n" +
			"benefit dinner\n" +
			"자선 만찬\n" +
			"\n" +
			"\n" +
			"\n" +
			"related to\n" +
			"(전치사) ~와 관련된\n" +
			"\n" +
			"\n" +
			"\n" +
			"indecisive\n" +
			"우유부단한\n" +
			"\n" +
			"\n" +
			"\n" +
			"al least\n" +
			"(부사) 적어도, 최소한\n" +
			"\n" +
			"\n" +
			"\n" +
			"other than\n" +
			"(전치사) ~외에\n" +
			"\n" +
			"\n" +
			"\n" +
			"automate\n" +
			"자동화하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"alternatively\n" +
			"(부사) 그 대신에, 그렇지 않으면\n" +
			"\n" +
			"\n" +
			"\n" +
			"debit\n" +
			"인출하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"december\n" +
			"12월\n" +
			"\n" +
			"\n" +
			"\n" +
			"must\n" +
			"(조동사) ~해야한다, ~임이 틀림없다\n" +
			"\n" +
			"\n" +
			"\n" +
			"wing\n" +
			"날개, 부속 건물, 날아가다, 발송되다\n" +
			"\n" +
			"\n" +
			"\n" +
			"additional\n" +
			"추가적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"maximum\n" +
			"최대(의), 최고(의)\n" +
			"\n" +
			"\n" +
			"\n" +
			"selection\n" +
			"선택, 선발\n" +
			"\n" +
			"\n" +
			"\n" +
			"expectation\n" +
			"예상, 기대\n" +
			"\n" +
			"\n" +
			"\n" +
			"expansion\n" +
			"확장, 확대\n" +
			"\n" +
			"\n" +
			"\n" +
			"reference\n" +
			"추천인, 추천서, 참고, 참조\n" +
			"\n" +
			"\n" +
			"\n" +
			"requirement\n" +
			"(자격) 요건\n" +
			"\n" +
			"\n" +
			"\n" +
			"appliance\n" +
			"가전제품\n" +
			"\n" +
			"\n" +
			"\n" +
			"approval\n" +
			"승인\n" +
			"\n" +
			"\n" +
			"\n" +
			"recruiter\n" +
			"채용 담당자\n" +
			"\n" +
			"\n" +
			"\n" +
			"participant\n" +
			"참가자\n" +
			"\n" +
			"\n" +
			"\n" +
			"planning\n" +
			"계획\n" +
			"\n" +
			"\n" +
			"\n" +
			"benefit\n" +
			"혜택\n" +
			"\n" +
			"\n" +
			"\n" +
			"discount\n" +
			"할인\n" +
			"\n" +
			"\n" +
			"\n" +
			"damage\n" +
			"손해\n" +
			"\n" +
			"\n" +
			"\n" +
			"complaint\n" +
			"불평, 불만\n" +
			"\n" +
			"\n" +
			"\n" +
			"agreement\n" +
			"협약, 계약\n" +
			"\n" +
			"\n" +
			"\n" +
			"prepaid\n" +
			"선불된, 선납된\n" +
			"\n" +
			"\n" +
			"\n" +
			"efficient\n" +
			"효율적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"fill in\n" +
			"채우다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be eligible for\n" +
			"~에 자격이 있다\n" +
			"\n" +
			"\n" +
			"\n" +
			"construction\n" +
			"공사\n" +
			"\n" +
			"\n" +
			"\n" +
			"satisfaction\n" +
			"만족\n" +
			"\n" +
			"\n" +
			"\n" +
			"inspection\n" +
			"검사, 조사\n" +
			"\n" +
			"\n" +
			"\n" +
			"assistant\n" +
			"조수, 보조 요원\n" +
			"\n" +
			"\n" +
			"\n" +
			"offer\n" +
			"제안하다, 제안\n" +
			"\n" +
			"\n" +
			"\n" +
			"provide\n" +
			"제공하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"should\n" +
			"~해야한다\n" +
			"\n" +
			"\n" +
			"\n" +
			"educational\n" +
			"교육의, 교육적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"education\n" +
			"교육\n" +
			"\n" +
			"\n" +
			"\n" +
			"transportation\n" +
			"수송, 수송하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"plan\n" +
			"계획, 계획하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"defeat\n" +
			"패배시키다\n" +
			"\n" +
			"\n" +
			"\n" +
			"bury\n" +
			"매장하다, 묻다\n" +
			"\n" +
			"\n" +
			"\n" +
			"devote\n" +
			"바치다, 헌신하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"infect\n" +
			"감염시키다\n" +
			"\n" +
			"\n" +
			"\n" +
			"overestimate\n" +
			"과대 평가하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"confine\n" +
			"가두다, 한정시키다, 제한하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"disperse\n" +
			"흩어지다\n" +
			"\n" +
			"\n" +
			"\n" +
			"characterize\n" +
			"기술하다, 묘사하다, 특징짓다\n" +
			"\n" +
			"\n" +
			"\n" +
			"preclude\n" +
			"방지하다, 가로막다\n" +
			"\n" +
			"\n" +
			"\n" +
			"listing\n" +
			"표, 목록, 명단\n" +
			"\n" +
			"\n" +
			"\n" +
			"journalist\n" +
			"기자, 언론인\n" +
			"\n" +
			"\n" +
			"\n" +
			"pharmacy\n" +
			"약국\n" +
			"\n" +
			"\n" +
			"\n" +
			"outlook\n" +
			"전망, 견해\n" +
			"\n" +
			"\n" +
			"\n" +
			"drawback\n" +
			"결점; 장애\n" +
			"\n" +
			"\n" +
			"\n" +
			"probationer\n" +
			"견습생, 수습 직원\n" +
			"\n" +
			"\n" +
			"\n" +
			"residue\n" +
			"나머지, 잔류물\n" +
			"\n" +
			"\n" +
			"\n" +
			"bond\n" +
			"유대, 채권\n" +
			"\n" +
			"\n" +
			"\n" +
			"forerunner\n" +
			"전조, 선구자\n" +
			"\n" +
			"\n" +
			"\n" +
			"participation\n" +
			"참가, 참여\n" +
			"\n" +
			"\n" +
			"\n" +
			"visitor\n" +
			"손님, 방문객\n" +
			"\n" +
			"\n" +
			"\n" +
			"opposition\n" +
			"반대(측)\n" +
			"\n" +
			"\n" +
			"\n" +
			"allotment\n" +
			"할당, 분배\n" +
			"\n" +
			"\n" +
			"\n" +
			"stagehand\n" +
			"무대 담당자\n" +
			"\n" +
			"\n" +
			"\n" +
			"hurdle\n" +
			"장애(물), 곤란한 문제\n" +
			"\n" +
			"\n" +
			"\n" +
			"fraction\n" +
			"(전체에 대해) 일부, 작은 부분\n" +
			"\n" +
			"\n" +
			"\n" +
			"remnant\n" +
			"나머지\n" +
			"\n" +
			"\n" +
			"\n" +
			"influx\n" +
			"유입, 밀려듦\n" +
			"\n" +
			"\n" +
			"\n" +
			"accessory\n" +
			"장신구\n" +
			"\n" +
			"\n" +
			"\n" +
			"apology\n" +
			"사과\n" +
			"\n" +
			"\n" +
			"\n" +
			"context\n" +
			"문맥, (사건 등의) 정황, 배경\n" +
			"\n" +
			"\n" +
			"\n" +
			"currency\n" +
			"통화, 화폐\n" +
			"\n" +
			"\n" +
			"\n" +
			"tenure\n" +
			"재임 기간, 보유 기간\n" +
			"\n" +
			"\n" +
			"\n" +
			"queue\n" +
			"줄, 줄을 서서 기다리다\n" +
			"\n" +
			"\n" +
			"\n" +
			"disturbance\n" +
			"방해, 혼란\n" +
			"\n" +
			"\n" +
			"\n" +
			"perception\n" +
			"자각, 인식\n" +
			"\n" +
			"\n" +
			"\n" +
			"modest\n" +
			"겸손한, 적당한\n" +
			"\n" +
			"\n" +
			"\n" +
			"active\n" +
			"활동적인, 적극적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"fluent\n" +
			"유창한\n" +
			"\n" +
			"\n" +
			"\n" +
			"unclaimed\n" +
			"주인이 나서지 않는, 청구하는 사람이 없는\n" +
			"\n" +
			"\n" +
			"\n" +
			"philanthropic\n" +
			"박애(주의)의, 인정 많은\n" +
			"\n" +
			"\n" +
			"\n" +
			"noteworthy\n" +
			"주목할 만한\n" +
			"\n" +
			"\n" +
			"\n" +
			"firsthand\n" +
			"직접의\n" +
			"\n" +
			"\n" +
			"\n" +
			"publication\n" +
			"출판, 발행, 출판물\n" +
			"\n" +
			"\n" +
			"\n" +
			"equip\n" +
			"장비를 갖추다, 준비를 갖춰 주다\n" +
			"\n" +
			"\n" +
			"\n" +
			"quite\n" +
			"매우, 상당히\n" +
			"\n" +
			"\n" +
			"\n" +
			"perfume\n" +
			"향수, 뿌리다\n" +
			"\n" +
			"\n" +
			"\n" +
			"public hearing\n" +
			"공청, 공청회\n" +
			"\n" +
			"\n" +
			"\n" +
			"approximately\n" +
			"거의, 대략\n" +
			"\n" +
			"\n" +
			"\n" +
			"around\n" +
			"대략\n" +
			"\n" +
			"\n" +
			"\n" +
			"host\n" +
			"주인, 주최하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"informal\n" +
			"허물없는, 비공식의\n" +
			"\n" +
			"\n" +
			"\n" +
			"serve\n" +
			"제공하다, 서브\n" +
			"\n" +
			"\n" +
			"\n" +
			"invoice\n" +
			"청구서, 청구서를 보내다\n" +
			"\n" +
			"\n" +
			"\n" +
			"attire\n" +
			"의복, 복장\n" +
			"\n" +
			"\n" +
			"\n" +
			"particularly\n" +
			"특히, 특별히\n" +
			"\n" +
			"\n" +
			"\n" +
			"opportunity\n" +
			"기회\n" +
			"\n" +
			"\n" +
			"\n" +
			"favorite\n" +
			"마음에 드는, 매우 좋아하는\n" +
			"\n" +
			"\n" +
			"\n" +
			"gifted\n" +
			"재능이 있는\n" +
			"\n" +
			"\n" +
			"\n" +
			"profound\n" +
			"깊은, 심오한\n" +
			"\n" +
			"\n" +
			"\n" +
			"confirmative\n" +
			"확증적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"susceptible\n" +
			"민감한, 예민한\n" +
			"\n" +
			"\n" +
			"\n" +
			"plentiful\n" +
			"풍부한, 충분한\n" +
			"\n" +
			"\n" +
			"\n" +
			"several\n" +
			"몇몇의, 각각의\n" +
			"\n" +
			"\n" +
			"\n" +
			"restless\n" +
			"가만히 못 있는, 제대로 쉬지 못하는\n" +
			"\n" +
			"\n" +
			"\n" +
			"educated\n" +
			"교육 받은\n" +
			"\n" +
			"\n" +
			"\n" +
			"adaptable\n" +
			"적응할 수 있는\n" +
			"\n" +
			"\n" +
			"\n" +
			"well-prepared\n" +
			"잘 준비된\n" +
			"\n" +
			"\n" +
			"\n" +
			"arbitrary\n" +
			"임의의, 독단적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"leisurely\n" +
			"느긋한, 여유 있는\n" +
			"\n" +
			"\n" +
			"\n" +
			"lax\n" +
			"느슨한, 해이한\n" +
			"\n" +
			"\n" +
			"\n" +
			"absolute\n" +
			"완전한, 확실한\n" +
			"\n" +
			"\n" +
			"\n" +
			"unlikely\n" +
			"~할 것 같지 않은, 있을 법하지 않은\n" +
			"\n" +
			"\n" +
			"\n" +
			"orderly\n" +
			"정돈된, 질서 있는\n" +
			"\n" +
			"\n" +
			"\n" +
			"equal\n" +
			"동일한, 동등한\n" +
			"\n" +
			"\n" +
			"\n" +
			"frequent\n" +
			"잦은, 빈번한\n" +
			"\n" +
			"\n" +
			"\n" +
			"complex\n" +
			"복잡한, 복합 건물\n" +
			"\n" +
			"\n" +
			"\n" +
			"dependent\n" +
			"의존하는, 의존적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"exotic\n" +
			"이국적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"greatly\n" +
			"대단히, 크게\n" +
			"\n" +
			"\n" +
			"\n" +
			"conversely\n" +
			"반대로\n" +
			"\n" +
			"\n" +
			"\n" +
			"fortunately\n" +
			"다행히도, 운 좋게도(↔ unfortunately 유감스럽게도)\n" +
			"\n" +
			"\n" +
			"\n" +
			"readily\n" +
			"즉시, 손쉽게\n" +
			"\n" +
			"\n" +
			"\n" +
			"presumably\n" +
			"아마, 추측컨대\n" +
			"\n" +
			"\n" +
			"\n" +
			"intentionally\n" +
			"고의로, 의도적으로\n" +
			"\n" +
			"\n" +
			"\n" +
			"hastily\n" +
			"급히, 서둘러서\n" +
			"\n" +
			"\n" +
			"\n" +
			"effectively\n" +
			"효과적으로\n" +
			"\n" +
			"\n" +
			"\n" +
			"externally\n" +
			"외부적으로, 외면적으로\n" +
			"\n" +
			"\n" +
			"\n" +
			"artificially\n" +
			"인위적으로, 인공적으로\n" +
			"\n" +
			"\n" +
			"\n" +
			"indefinitely\n" +
			"무기한으로\n" +
			"\n" +
			"\n" +
			"\n" +
			"concisely\n" +
			"간결하게\n" +
			"\n" +
			"\n" +
			"\n" +
			"assertively\n" +
			"단호히, 단정적으로\n" +
			"\n" +
			"\n" +
			"\n" +
			"ever\n" +
			"(부사) 언제든, 지금껏, 항상\n" +
			"\n" +
			"\n" +
			"\n" +
			"a series of\n" +
			"일련의\n" +
			"\n" +
			"\n" +
			"\n" +
			"promote\n" +
			"촉진하다, 홍보하다, 승진시키다\n" +
			"\n" +
			"\n" +
			"\n" +
			"anticipate\n" +
			"예상하다, 예측하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"operate\n" +
			"(자동사, 타동사) 운영하다, 가동하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"direct\n" +
			"보내다, 안내하다, 직접적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"toward\n" +
			"(전치사) ~쪽으로, ~를 향하여\n" +
			"\n" +
			"\n" +
			"\n" +
			"frequently\n" +
			"자주, 흔히\n" +
			"\n" +
			"\n" +
			"\n" +
			"properly\n" +
			"제대로, 적절히\n" +
			"\n" +
			"\n" +
			"\n" +
			"undergo\n" +
			"(특히 안 좋은 일들을) 겪다, 받다\n" +
			"\n" +
			"\n" +
			"\n" +
			"vice president\n" +
			"부통령, 부대표\n" +
			"\n" +
			"\n" +
			"\n" +
			"consult\n" +
			"상담하다, ~을 참고하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"rely on\n" +
			"(자동사) ~에 의지하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"postal supplies\n" +
			"우편용품\n" +
			"\n" +
			"\n" +
			"\n" +
			"upcoming\n" +
			"다가오는\n" +
			"\n" +
			"\n" +
			"\n" +
			"beginning\n" +
			"~부터\n" +
			"\n" +
			"\n" +
			"\n" +
			"defective\n" +
			"결함 있는\n" +
			"\n" +
			"\n" +
			"\n" +
			"be exchanged for\n" +
			"~으로 교환되다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be concerned about\n" +
			"~에 대해 걱정하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"acquire\n" +
			"얻다, 인수하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"in preparation for\n" +
			"~을 대비하여\n" +
			"\n" +
			"\n" +
			"\n" +
			"be ready to부정사\n" +
			"~할 준비가 되다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be willing to부정사\n" +
			"기꺼이 ~하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be invited to부정사\n" +
			"~하도록 초대되다/요청받다\n" +
			"\n" +
			"\n" +
			"\n" +
			"be required to부정사\n" +
			"~하는 것이 필수이다\n" +
			"\n" +
			"\n" +
			"\n" +
			"by -ing\n" +
			"(전치사) ~함으로써\n" +
			"\n" +
			"\n" +
			"\n" +
			"have difficulty -ing\n" +
			"~하는 데 어려움이 있다\n" +
			"\n" +
			"\n" +
			"\n" +
			"contribute to -ing\n" +
			"~에 공헌하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"lower\n" +
			"낮추다, (형용사) 아래 쪽의\n" +
			"\n" +
			"\n" +
			"\n" +
			"dispose of\n" +
			"처리하다, 버리다\n" +
			"\n" +
			"\n" +
			"\n" +
			"specify\n" +
			"명시하다, 구체화하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"market\n" +
			"시장, 내놓다, 광고하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"worn\n" +
			"입다(wear의 과거분사)\n" +
			"\n" +
			"\n" +
			"\n" +
			"alert\n" +
			"기민한, (위험 등을) 알리다, 경보\n" +
			"\n" +
			"\n" +
			"\n" +
			"growing business\n" +
			"성장하는 사업\n" +
			"\n" +
			"\n" +
			"\n" +
			"personal\n" +
			"개인적인\n" +
			"\n" +
			"\n" +
			"\n" +
			"experienced staff\n" +
			"경험이 풍부한 직원\n" +
			"\n" +
			"\n" +
			"\n" +
			"confused\n" +
			"혼란스러운\n" +
			"\n" +
			"\n" +
			"\n" +
			"disappointing\n" +
			"실망스러운\n" +
			"\n" +
			"\n" +
			"\n" +
			"satisfied\n" +
			"만족하는, 납득하는\n" +
			"\n" +
			"\n" +
			"\n" +
			"boarding pass\n" +
			"탑승권\n" +
			"\n" +
			"\n" +
			"\n" +
			"ingredient\n" +
			"재료, 구성 요소\n" +
			"\n" +
			"\n" +
			"\n" +
			"competent\n" +
			"능숙한, 유능한, 적격인\n" +
			"\n" +
			"\n" +
			"\n" +
			"keep\n" +
			"유지하다, 지키다, 계속하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"anyone\n" +
			"누구, 아무, 누구나\n" +
			"\n" +
			"\n" +
			"\n" +
			"dinner\n" +
			"식사, 정식, 만찬\n" +
			"\n" +
			"\n" +
			"\n" +
			"constant\n" +
			"끊임없는, 변함없는, 정수\n" +
			"\n" +
			"\n" +
			"\n" +
			"exciting\n" +
			"흥미진진한\n" +
			"\n" +
			"\n" +
			"\n" +
			"excited\n" +
			"신난, 즐거운\n" +
			"\n" +
			"\n" +
			"\n" +
			"excite\n" +
			"흥분시키다\n" +
			"\n" +
			"\n" +
			"\n" +
			"by Ving\n" +
			"(수단) ~함으로써\n" +
			"\n" +
			"\n" +
			"\n" +
			"throughout\n" +
			"(시간) ~내내, (공간) ~전체에\n" +
			"\n" +
			"\n" +
			"\n" +
			"passenger\n" +
			"승객\n" +
			"\n" +
			"\n" +
			"\n" +
			"emission\n" +
			"배출, 배출물, 배기가스\n" +
			"\n" +
			"\n" +
			"\n" +
			"as of\n" +
			"~부터\n" +
			"\n" +
			"\n" +
			"\n" +
			"until\n" +
			"~까지(지속)\n" +
			"\n" +
			"\n" +
			"\n" +
			"in front of\n" +
			"~의 앞에\n" +
			"\n" +
			"\n" +
			"\n" +
			"throughout\n" +
			"~ 곳곳에, (기간) ~내내\n" +
			"\n" +
			"\n" +
			"\n" +
			"into\n" +
			"~으로, ~안에\n" +
			"\n" +
			"\n" +
			"\n" +
			"about\n" +
			"~에 관하여\n" +
			"\n" +
			"\n" +
			"\n" +
			"in spite of\n" +
			"~에도 불구하고\n" +
			"\n" +
			"\n" +
			"\n" +
			"across from\n" +
			"~의 맞은편에\n" +
			"\n" +
			"\n" +
			"\n" +
			"starting\n" +
			"(전치사) ~부터\n" +
			"\n" +
			"\n" +
			"\n" +
			"double\n" +
			"두배의, 두 배, 두 배가 되다\n" +
			"\n" +
			"\n" +
			"\n" +
			"collaborative\n" +
			"협력하는, 공동의\n" +
			"\n" +
			"\n" +
			"\n" +
			"former\n" +
			"예전의, 과거의\n" +
			"\n" +
			"\n" +
			"\n" +
			"as well\n" +
			"(부사) 또한, 역시\n" +
			"\n" +
			"\n" +
			"\n" +
			"provided that\n" +
			"(접속사) ~하는 조건으로, ~하는 한\n" +
			"\n" +
			"\n" +
			"\n" +
			"in order that\n" +
			"(접속사) ~하기 위해서\n" +
			"\n" +
			"\n" +
			"\n" +
			"rate\n" +
			"속도, 비율, 금액, 평가하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"sculpture\n" +
			"조각품, 조각\n" +
			"\n" +
			"\n" +
			"\n" +
			"as\n" +
			"(전치사) ~처럼, ~로, (부사) ~만큼\n" +
			"\n" +
			"\n" +
			"\n" +
			"other than\n" +
			"(전치사) ~외에\n" +
			"\n" +
			"\n" +
			"\n" +
			"alternatively\n" +
			"(부사) 그 대신에, 그렇지 않으면\n" +
			"\n" +
			"\n" +
			"\n" +
			"fall\n" +
			"떨어지다\n" +
			"\n" +
			"\n" +
			"\n" +
			"in order that\n" +
			"(접속사) ~하기 위해서\n" +
			"\n" +
			"\n" +
			"\n" +
			"rate\n" +
			"속도, 비율, 평가하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"letter\n" +
			"편지\n" +
			"\n" +
			"\n" +
			"\n" +
			"along\n" +
			"(전치사) ~을 따라\n" +
			"\n" +
			"\n" +
			"\n" +
			"arrival\n" +
			"도착, 도착한 사람\n" +
			"\n" +
			"\n" +
			"\n" +
			"visit\n" +
			"방문, 방문하다\n" +
			"\n" +
			"\n" +
			"\n" +
			"until further notice\n" +
			"추후 공지가 있을 때까지\n" +
			"\n" +
			"\n" +
			"\n" +
			"onto\n" +
			"~로, ~쪽으로\n" +
			"\n" +
			"\n" +
			"\n" +
			"twofold\n" +
			"이중적인, 두 배의\n" +
			"\n" +
			"\n" +
			"\n" +
			"automation\n" +
			"자동화\n" +
			"\n" +
			"\n" +
			"\n" +
			"hold\n" +
			"잡다, 잡기, 정지\n" +
			"\n" +
			"\n" +
			"\n" +
			"although\n" +
			"(접속사) ~이긴 하지만, 그러나, 하지만\n" +
			"\n" +
			"\n" +
			"\n" +
			"nearby\n" +
			"(형용사) 인근의, (부사) 인근에\n" +
			"\n" +
			"\n" +
			"\n" +
			"pass through\n" +
			"~을 지나가다\n" +
			"\n" +
			"\n" +
			"\n" +
			"reception\n" +
			"접수처, 환영회, 연회, 환영";
}
