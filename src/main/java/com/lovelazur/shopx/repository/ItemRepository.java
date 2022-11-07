package com.lovelazur.shopx.repository;

import com.lovelazur.shopx.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//Entiry Class and ID
public interface ItemRepository extends JpaRepository<Item, Long> {

    List<Item> findByItemNm(String 나이키_후드티);


    //JPQL Snippet
    //AND Sample Is는 있어도 되고 없어도 되고, Is / Equals 붙여도 결과 같
    List<Item>  findByItemNmAndPrice(String itemNm, int price);

    //Or Is는 있어도 되고 없어도 되고
    List<Item>  findByItemNmOrPrice(String itemNm, int price);

    //query style 만든 것
    @Query("select i from Item i where i.itemNm = ?1 or i.price = ?2")
    List<Item> findByItemNmOrPrice_Q(String itemNm, int price);

    //Between
    List<Item>  findByPriceBetween(int start, int end);

    //Less then snippet style , 위와 아래는 완전히 동
    List<Item> findByPriceLessThan(int price);

    //Less then, Query style
    @Query("select i from Item i where i.price < ?1")
    List<Item> findByPriceLessThan_Q(int price);

    //JPA Palette를 이용하면 쉽게 만들 수 있음.
    //규칙은 find + [엔티티 이름, 생략가능] + By + [변수이름] + [SQL 연산자]
    //https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation

    //@Query를 사용하는 방법은?
    //https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.at-query
}

