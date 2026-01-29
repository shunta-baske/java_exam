package exam;

import java.util.List;

import dao.MemberDao;
import dto.Member;

/**
 * findAll()メソッド、動作確認用の実行クラスです.
 * 
 * @author igamasayuki
 *
 */
public class FindAllMain {

	public static void main(String[] args) {
		MemberDao dao = new MemberDao();

		List<Member>members= dao.findAll();
	
		for(Member member :members){
			System.out.println(member);
		}

	}

}
