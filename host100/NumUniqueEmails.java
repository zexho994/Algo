import java.util.HashSet;
import java.util.Set;

/**
 * @author : zexho
 * @created : 2022-06-04
**/
public class NumUniqueEmails{
     public int numUniqueEmails(String[] emails) {
        Set<String> emailsSet = new HashSet<>();
        for(String email : emails){
            String[] parts = email.split("@");
            String domain = parts[1];
            String local = parts[0].split("\\+")[0];
            local = local.replace(".","");
            emailsSet.add(local+"@"+domain);
        }
        return emailsSet.size();
    }
}
