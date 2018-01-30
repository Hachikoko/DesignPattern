#include "stdafx.h"
#include "MallarDuck.h"
#include "FlywithWings.h"
#include "Quack.h"


MallarDuck::MallarDuck()
{
	flyBehavior = new FlywithWings();
	quackBehavior = new Quack();
}


MallarDuck::~MallarDuck()
{
}
