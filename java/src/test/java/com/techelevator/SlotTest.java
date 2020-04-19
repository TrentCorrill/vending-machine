package com.techelevator;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

import com.techelevator.model.Candy;
import com.techelevator.model.Slot;

public class SlotTest {
	Slot sut;

	@Before
	public void setup() {
		sut = new Slot("A1", 69, new Candy("Cat", new BigDecimal("69.69")));
	}

	@Test
	public void Can_I_Add_A_Slot() {
		Assert.assertEquals("A1", sut.getSlotId());
		Assert.assertEquals(69, sut.getQuantity());
		Assert.assertEquals("Cat", sut.getItem().getName());
		Assert.assertEquals(new BigDecimal("69.69"), sut.getItem().getPrice());
		Assert.assertEquals("Munch Munch, Yum!", sut.getItem().getPurchaseSound());
	}
}
