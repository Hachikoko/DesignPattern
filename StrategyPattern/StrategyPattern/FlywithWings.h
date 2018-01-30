#pragma once
#include "FlyBehavior.h"
class FlywithWings :
	public FlyBehavior
{
public:
	FlywithWings();
	~FlywithWings();
	virtual void fly();
};

