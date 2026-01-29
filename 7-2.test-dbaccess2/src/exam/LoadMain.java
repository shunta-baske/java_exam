package exam;

import java.lang.reflect.Member;

import dao.MemberDao;

/**
 * load()メソッド、動作確認用の実行クラスです.
 * 
 * @author igamasayuki
 *
 */
public class LoadMain {

	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		dto.Member member = dao.load(2);
		System.out.println(member);

	}

}
