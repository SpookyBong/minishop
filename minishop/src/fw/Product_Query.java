package fw;
//SQL만 정의하는 클래스 - 프레임워크 기반으로 작업을 하면 설정파일(XML)로 변경됨
public class Product_Query {
	public static String PRODUCT_LIST = "select * from TB_PRODUCT";
	public static String PRODUCT_LIST_CATE = "select * from TB_PRODUCT where category_no=?";
	public static String PRODUCT_TOP = "select prd_no,prd_nm,img_gen_file_nm from TB_PRODUCT where prd_no in(select prd_no from topproduct)";
}
