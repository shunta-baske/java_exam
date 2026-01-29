package dto;

/**
 * メンバー情報を表すDTO.
 * 
 * @author igamasayuki
 *
 */
public class Member {
	/** ID */
	private int id;
	/** 名前 */
	private String name;
	/** 年齢 */
	private int age;
	/** 部署ID */
	private int dep_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getDep_id() {
		return dep_id;
	}

	public void setDep_id(int dep_id) {
		this.dep_id = dep_id;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", age=" + age + ", dep_id=" + dep_id + "]";
	}

}
