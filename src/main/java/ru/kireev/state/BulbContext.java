package ru.kireev.state;

/**
 * @author sergey
 * created on 12.09.18.
 */
class BulbContext {

  private State state = StateProvider.getOffState();

  void performAction() {
    this.setState(state.action());
  }

  void setState(State state) {
    this.state = state;
  }
}
