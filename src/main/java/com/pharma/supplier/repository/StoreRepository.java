package com.pharma.supplier.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pharma.supplier.entity.StoreEntity;
import com.pharma.supplier.entity.SupplierEntity;

@Repository
public interface StoreRepository extends JpaRepository<StoreEntity, String> {

	@Query
	Optional<StoreEntity> findByStoreCode(long storeCode);

	@Query("SELECT s FROM SupplierEntity s WHERE " + "LOWER(s.companyName) LIKE LOWER(CONCAT('%', :query, '%'))")
	List<SupplierEntity> supplierAheadSearch(@Param("query") String query);
}
