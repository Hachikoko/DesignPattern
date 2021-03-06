// StrategyPattern.cpp: 定义控制台应用程序的入口点。
//

#include "stdafx.h"
#include "Duck.h"
#include "MallarDuck.h"
#include "FlyNoWay.h"
#include "Squeak.h"
#include <iostream>


using namespace std;

int main()
{
	Duck* duck = new MallarDuck();
	duck->MakeSound();
	duck->FlyWay();

	duck->setFlyBehavior(new FlyNoWay());
	duck->setQuackBehavior(new Squeak());

	cout << endl;
	duck->MakeSound();
	duck->FlyWay();
	cin.get();
    return 0;
}

