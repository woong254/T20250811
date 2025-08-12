package co.yedam.mapper;

import java.util.List;

import co.yedam.vo.ProductVO;

public interface ProductMapper {
	String selectMessage();
	String selectHint(String remainTimeString);
    // 상품목록 메소드정의.
	List<ProductVO> selectMain();
	// 상품상세 메소드정의.
	ProductVO selectInfo(String prdCode);
}
