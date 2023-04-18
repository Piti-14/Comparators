import java.util.*;

public class Ex2_LotteryJustice {

    public static void main(String[] args) {

        Population p1 = new Population(9, 4);
        Population p2 = new Population(10, 6);
        Population p3 = new Population(9, 5);
        Population p4 = new Population(1, 3);
        Population p5 = new Population(27, 42);
        Population p6 = new Population(121, 2403);
        Population p7 = new Population(721, 4);

        List<Population> list1 = new ArrayList<>();
        list1.add(p1);
        list1.add(p2);
        list1.add(p3);
        list1.add(p4);

        List<Population> list2 = new ArrayList<>();
        list2.add(p5);
        list2.add(p6);
        list2.add(p7);

        List<Population> list3 = new ArrayList<>();

        PopulationList p1_list = new PopulationList(list1);
        PopulationList p2_list = new PopulationList(list2);
        PopulationList p3_list = new PopulationList(list3);

        List<PopulationList> lists = new ArrayList<>();
        lists.add(p1_list);
        lists.add(p2_list);
        lists.add(p3_list);

        Comparator<Population> comparator = Comparator.comparing(Population::getN_prizes)
                                                      .thenComparing(Population::getN_investment).reversed();

        String result = "";

        for (PopulationList l : lists) {

            if (l.getList().size() != 0) {
                Collections.sort(l.getList(), comparator);
                //System.out.println(l.getList());

                int previousInvest = l.getList().get(0).getN_investment();
                int previousRewards = l.getList().get(0).getN_prizes();

                for (int i = 1; i < l.getList().size(); i++) {

                    int nextInvest = l.getList().get(i).getN_investment();
                    int nextRewards = l.getList().get(i).getN_prizes();

                    if ((previousInvest >= nextInvest && previousRewards > nextRewards)) {
                        result = "SI";
                    } else {
                        result = "NO";
                    }

                    previousInvest = l.getList().get(i).getN_investment();
                    previousRewards = l.getList().get(i).getN_prizes();
                }

                System.out.println(result);
            }
        }
    }
}
