package fw;
//SQL�� �����ϴ� Ŭ���� - �����ӿ�ũ ������� �۾��� �ϸ� ��������(XML)�� �����
public class Product_Query {
	public static String PRODUCT_LIST = "select * from TB_PRODUCT";
	public static String PRODUCT_LIST_CATE = "select * from TB_PRODUCT where category_no=?";
	public static String PRODUCT_TOP = "select prd_no,prd_nm,img_gen_file_nm from TB_PRODUCT where prd_no in(select prd_no from topproduct)";
}
