import java.util.ArrayList;

public class VoteProcessor {

	public String calculateElectionWinner(ArrayList<String> votes) {
		String result = "";
		int pfvotes = 0;
		int esvotes = 0;
		
		for (int i = 0; i < votes.size(); i++) {
			if (votes.get(i).equalsIgnoreCase("pope francis")) {
				pfvotes+=1;
			} else if (votes.get(i).equalsIgnoreCase("edward snowden")) {
				esvotes+=1;
			}
		}
		
		if (pfvotes == esvotes) {
			result = "TIE";
		} else if (pfvotes > esvotes) {
			result = "pope francis";
		} else {
			result = "edward snowden";
		}
		return result;
	}
	
}
