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
public interface SupplierRepository extends JpaRepository<SupplierEntity, String> {

	@Query("SELECT s FROM SupplierEntity s WHERE s.supplierCode = :supplierCode")
	Optional<SupplierEntity> findBySupplierCode(long supplierCode);

	@Query("SELECT s FROM StoreEntity s WHERE " + "LOWER(s.name) LIKE LOWER(CONCAT('%', :query, '%')) OR "
			+ "LOWER(s.area) LIKE LOWER(CONCAT('%', :query, '%'))")
	List<StoreEntity> storeAheadSearch(@Param("query") String query);
}
