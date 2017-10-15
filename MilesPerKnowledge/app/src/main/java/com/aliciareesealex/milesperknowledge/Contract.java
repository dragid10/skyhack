package com.aliciareesealex.milesperknowledge;

/**
 * Name: Alex Oladele
 * Unique-ID: OLADELAA
 * Date: 10/14/17
 * Project: MilesPerKnowledge
 */

public interface Contract {
	interface MPKView {
		//		void showToastMessage(String message);
		interface TopicActivityView extends MPKView {

		}

		interface LoginActivityView extends MPKView {

		}

		interface MainActivityView extends MPKView {

		}

		interface SearchAirportFragmentView extends MPKView {

		}

		interface TopicSelectionFragmentView extends MPKView {

		}

		interface VideoFragmentView extends MPKView {

		}
	}

	interface MPKPresenter {
		interface TopicActivityPresenter extends MPKPresenter {

		}

		interface LoginActivityPresenter extends MPKPresenter {

		}

		interface MainActivityPresenter extends MPKPresenter {

		}

		interface SearchAirportFragmentPresenter extends MPKPresenter {

		}


		interface TopicSelectionFragmentPresenter extends MPKPresenter {

		}

		interface VideoFragmentPresenter extends MPKPresenter {

		}
	}

	interface MPKModel {
		interface AchievementModel extends MPKModel {

		}

		interface AirportModel extends MPKModel {

		}

		interface FlightModel extends MPKModel {

		}

		interface TopicModel extends MPKModel {

		}

		interface UserModel extends MPKModel {

		}
	}
}
