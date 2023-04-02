package br.com.dio.Generation;

import java.util.*;

public class resultPilha {


    public static List<Integer> closestNumbers(List<Integer> list) {
        int currentDiferenca = Integer.MAX_VALUE;
        int minimumDiferenca = Integer.MAX_VALUE;

        List<Integer> pairsWithMinimumDiferenca = new ArrayList<>();
        Collections.sort(list);

        for (int i = 0; i < list.size() - 1; i++) {
            List<Integer> currentPair = new ArrayList<>(
                    Arrays.asList(
                            list.get(i),
                            list.get(i + 1)
                    )
            );
            currentDiferenca = currentPair.get(1) - currentPair.get(0);

            if (currentDiferenca == minimumDiferenca) {
                pairsWithMinimumDiferenca.addAll(currentPair);
            } else if (currentDiferenca < minimumDiferenca) {
                pairsWithMinimumDiferenca.clear();
                minimumDiferenca = currentDiferenca;
                pairsWithMinimumDiferenca.addAll(currentPair);
            }
        }

        return pairsWithMinimumDiferenca;
    }
}


