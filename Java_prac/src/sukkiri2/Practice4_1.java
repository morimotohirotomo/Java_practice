package sukkiri2;
import java.util.Date;

public class Practice4_1 {
	private String title;
	private Date publishDate;
	private String comment;

	public int hashCode() {
		int r = 1;
		r = 31 * r + publishDate.hashCode();
		r = 31 * r + title.hashCode();
		return r;
	}

	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null) return false;
		if (!(o instanceof Practice4_1)) return false;
		Practice4_1 p = (Practice4_1) o;
		if (!publishDate.equals(p.publishDate)) return false;
		if (!title.equals(p.title)) return false;
		return true;
	}
}
