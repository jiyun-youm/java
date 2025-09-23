package quiz04;

public class EBook extends Book {
    double fileSize;

    @Override
    public String toString() {
        return "제목: " + title + ", 저자: " + author + ", 가격: " + price + "원"+"파일사이즈"+fileSize;
    }

    @Override
    double getFinalPrice() {
        return (price*0.9);
    }
    //오버로딩
    String findBook(String title){
        if(this.title.equals(title)){    //문자열 비교는 ==쓰면 안됨, equals 써야함
            return title;
        } else {
            return null;
        }
    }

    double findBook(double maxPrice){
        if(this.price>maxPrice) {
            return maxPrice;
        } else { return this.price;}
    }

}
