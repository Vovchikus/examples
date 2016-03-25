class Bicycle(object):
	def __init__(self, start_speed):
		self._start_speed = start_speed

	def get_speed(self):
		return self._start_speed

	def speed_up(self, i):
		self._start_speed += i

class MountainBike (Bicycle):
	def __init__(self, start_speed, height):
		super(MountainBike , self).__init__(start_speed)
		self._height = height

	def get_height(self):
		return self._height

	def set_height(self, val):
		self._height = val

mountain_bike = MountainBike(5, 3)
mountain_bike.set_height(13)
mountain_bike.speed_up(5)

print mountain_bike.get_speed()
		
		