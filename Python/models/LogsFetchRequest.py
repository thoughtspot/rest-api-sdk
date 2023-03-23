class LogsFetchRequest():
	_names = {'log_type':'log_type','start_epoch_time_in_millis':'start_epoch_time_in_millis','end_epoch_time_in_millis':'end_epoch_time_in_millis',}
	def __init__(self,log_type,start_epoch_time_in_millis=None,end_epoch_time_in_millis=None,):
		'''
		Args:
		log_type (string): Name of the log type.
		start_epoch_time_in_millis (number): Start time in EPOCH format.
		end_epoch_time_in_millis (number): End time in EPOCH format.
		'''
		self.log_type = log_type
		self.start_epoch_time_in_millis = start_epoch_time_in_millis
		self.end_epoch_time_in_millis = end_epoch_time_in_millis
