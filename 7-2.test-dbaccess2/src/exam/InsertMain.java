package exam;

import java.lang.reflect.Member;

import dao.MemberDao;

/**
 * insert()メソッド、動作確認用の実行クラスです.
 * 
 * @author igamasayuki
 *
 */
public class InsertMain {

	public static void main(String[] args) {
		MemberDao dao = new MemberDao();

		// dto.Member member = dao.load(1);
		dto.Member member = null;
		member.setName("シロー");
		member.setAge(54);
		member.setDep_id(3);

		dao.insert(member);


		

		System.out.println("insert終了");
	}

}
