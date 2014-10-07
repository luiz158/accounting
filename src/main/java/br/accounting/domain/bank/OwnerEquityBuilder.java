package br.accounting.domain.bank;

import br.accounting.domain.util.builder.IBuilder;

public class OwnerEquityBuilder implements IBuilder<OwnerEquity> {

	@Override
	public OwnerEquity build() {

		OwnerEquity ownerEquity = new OwnerEquity();

		ownerEquity.addDescendentAccount(ownerEquity.getEquities());

		return ownerEquity;
	}

}