package BoardGames;

import java.util.List;

public interface DisDAO2 {
	
	public void insert (SetDis dis);
	public List<SetDis> ShowAllComments ();
	public void update (String id, String comment);
	public void delete(SetDis dis);
	public List<SetDis> getDis();
	
	
	
	

}
