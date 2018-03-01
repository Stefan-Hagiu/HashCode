ride: stpos sfpos stc sfc




car: pos T

best(car, rides)
{
  max = -1;
  pick = -1;
  for(ride in rides)
  {
    score = gain(ride);
    if(score > max)
    {
      score = max;
      pick = ride;
    }
  }
  return tuple(score, pick);
}

gain(car, ride)
{
  arrivalT = T + dist(stpos, pos);
  destinationT = dist(sfpos, stpos);
  if(destinationT > sfc)
  {
    return 0;
  }
  if(arrivalT == stc)
  {
    score = g_bonus + best(car, rides)
  }
  rides.remove(ride);
  auxpos = car.pos;
  car.pos = sfpos;
  score = score + dist(sfpos, stpos) + best(car, rides);
  cat.pos = auxpos;
  rides.add(ride);
}
