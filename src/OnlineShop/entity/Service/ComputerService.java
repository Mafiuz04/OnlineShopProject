package OnlineShop.entity.Service;

import OnlineShop.entity.Entity.Computer;

public interface ComputerService {
  int RAM_2GB = 2;
  int RAM_4GB = 4;
  int RAM_8GB = 8;
  int RAM_16GB = 16;
  int RAM_32B = 32;
  int RAM_64B = 64;
  static void chooseProcessor(Computer computer, String processor){
    computer.setProcessor(processor);
  }
   static void chooseRAMAmount(Computer computer, int ram){
    computer.setMemoryRAM(ram);
  }


}
