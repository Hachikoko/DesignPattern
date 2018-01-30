#pragma once
#include "FlyBehavior.h"
#include "QuackBehavior.h"
class Duck
{
public:
	Duck();
	~Duck();

protected:
	FlyBehavior* flyBehavior;
	QuackBehavior* quackBehavior;
public:
	void setFlyBehavior(FlyBehavior* flyBehavior);
	void setQuackBehavior(QuackBehavior* quackBehavior);
	void MakeSound();
	void FlyWay();
};

