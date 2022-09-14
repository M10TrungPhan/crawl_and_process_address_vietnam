import os

from common.common_keys import *
from object.singleton import Singleton


class Config(metaclass=Singleton):
    path_save_data = os.getenv(PATH_SAVE_DATA,
                              "E:/test_street/")

    number_of_crawler = os.getenv(NUMBER_OF_CRAWLER, 5)
    logging_folder = path_save_data + "log/"
