package tutorials;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Tony Andersson <mailto:Tony.andersson@so4it.com/>
 * @since 0.0.10
 */
public class TestSet {



        public static void main(final String[] args) {
            final Set<String[]> s = new HashSet<String[]>();
            final Set<List<String>> s2 = new HashSet<List<String>>();

            s.add(new String[]{"lucy", "simon"});
            s2.add(Arrays.asList(new String[]{"lucy", "simon"}));

            System.out.println(s.contains(new String[]{"lucy", "simon"})); // false
            System.out.println(s2.contains(Arrays.asList(new String[]{"lucy", "simon"}))); // true
        }

    }

