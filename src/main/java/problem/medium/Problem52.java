package problem.medium;

import problem.medium.resources.Product;

import java.util.List;

public class Problem52 {

    /**
     * 주어진 제품(Product) 리스트에서 가격이 20달러 이하인 제품들의 이름을 반환합니다.
     *
     * @param products 제품 리스트
     * @return 가격이 20달러 이하인 제품들의 이름 리스트
     */
    public static List<String> getProductNamesUnder20Dollars(List<Product> products) {
        // 여기에 코드 작성
        return products.stream()
                .filter(p -> p.getPrice() <= 20)
                .map(Product::getName)
                .toList();
    }
}
