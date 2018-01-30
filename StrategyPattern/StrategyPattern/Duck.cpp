#include "stdafx.h"
#include "Duck.h"
#include "FlyBehavior.h"
#include "QuackBehavior.h"

Duck::Duck()
{
}


Duck::~Duck()
{
}


void Duck::setFlyBehavior(FlyBehavior* flyBehavior)
{
	this->flyBehavior = flyBehavior;
}


void Duck::setQuackBehavior(QuackBehavior* quackBehavior)
{
	this->quackBehavior = quackBehavior;
}


void Duck::MakeSound()
{
	quackBehavior->quack();
}


void Duck::FlyWay()
{
	flyBehavior->fly();
}
